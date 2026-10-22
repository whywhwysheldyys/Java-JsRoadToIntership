# Java Core Advanced: Methods (Методы и организация кода)

## 📚 Теоретический разбор (Advanced)

### 1. Передача параметров: Pass-by-Value

* **Единый механизм Java:**
  В Java **всегда** используется передача аргументов строго **по значению (Pass-by-Value)**. Понятия «передача по ссылке» (Pass-by-Reference) в языке не существует.

* **Работа с примитивными типами (`int`, `double`, `boolean`):**
  При передаче примитива метод получает **копию самого значения**. Любые модификации переменной внутри метода затрагивают только локальную копию и не влияют на исходную переменную.

* **Работа со ссылочными типами (Объекты, Массивы):**
  При передаче объекта метод получает **копию значения ссылки** (копию адреса памяти в Heap).
  * **Изменение состояния объекта:** Изменение полей объекта через методы-сеттеры внутри вызова изменяет сам объект в Heap, поэтому изменения видны во внешнем коде.
  * **Переприсваивание ссылки:** Присвоение переменной нового объекта (`user = new User(...)`) внутри метода меняет локальную копию ссылки. Внешняя переменная продолжает указывать на первоначальный объект.

### 2. Стек вызовов (Call Stack) и `StackOverflowError`

* **Структура памяти Call Stack:**
  Стек вызовов — это область памяти JVM, предназначенная для хранения контекста выполнения методов.
  * При каждом вызове метода в стеке создается отдельный **фрейм (`Stack Frame`)**.
  * Фрейм содержит: локальные переменные, входящие параметры, промежуточные вычисления и адрес возврата.
  * Организован по принципу **LIFO** (Last In, First Out).

* **Причина `StackOverflowError`:**
  Выникает при исчерпании выделенной памяти стека (обычно из-за бесконечной рекурсии или глубокой вложенности вызовов). В этом случае JVM прерывает выполнение программы исключением `java.lang.StackOverflowError`.

### 3. Перегрузка методов (Method Overloading)

* **Сигнатура метода:**
  Уникальный идентификатор метода для компилятора. Состоит из **имени метода** и **списка типов параметров** (включая их порядок).
  * **Не входят в сигнатуру:** возвращаемый тип (`return type`), модификаторы доступа (`public`, `static`), имена параметров и бросаемые исключения.

* **Правила разрешения перегрузки (Method Resolution):**
  Компилятор ищет наиболее подходящий метод по каскаду правил:
  1. Точное совпадение типов аргументов.
  2. Автоматическое расширение примитивных типов (`Primitive Widening`: `int` $\rightarrow$ `long` $\rightarrow$ `double`).
  3. Автоупаковка/автораспаковка (`Autoboxing/Unboxing`: `int` $\rightarrow$ `Integer`).
  4. Аргументы переменной длины (`Varargs`).

### 4. Аргументы переменной длины (Varargs)

* **Механика и синтаксический сахар:**
  Синтаксис `Type... name` под капотом транслируется компилятором в создание и передачу обычного массива `Type[]`.

* **Правила применения:**
  1. В сигнатуре метода может быть **только один** параметр `Varargs`.
  2. Параметр `Varargs` обязан находиться **в самом конце** списка параметров.

### 5. Рекурсия и базовый случай

* **Рекурсивный вызов:**
  Метод вызывает сам себя с измененным набором аргументов. Каждый шаг создаёт новый фрейм в Call Stack ($O(N)$ по памяти).

* **Базовый случай (Base Case):**
  Условие выхода из рекурсии, при наступлении которого метод прекращает самовызов и начинается процесс «сворачивания» стека (выгрузка фреймов в обратном порядке).

---

## 💻 Разбор практических задач

### Задача 1: `MathOperations.java`

**Цель:** Демонстрация перегрузки методов и использования `varargs`.

```java
package second_practice.advanced03.basics01.methods.practice;

public class MathOperations {
  // 1. Перегрузка для двух целых чисел
  public static int calculateSum(int a, int b) {
    return a + b;
  }

  // 2. Перегрузка для трех чисел с плавающей точкой
  public static double calculateSum(double a, double b, double c) {
    return a + b + c;
  }

  // 3. Перегрузка с использованием varargs (произвольное кол-во аргументов)
  public static int calculateSum(int... numbers) {
    int result = 0;
    for (int number : numbers) {
      result += number;
    }
    return result;
  }
}
```

```java
package second_practice.advanced03.basics01.methods.practiceMain;

import second_practice.advanced03.basics01.methods.practice.MathOperations;

public class MathMain {
  public static void main(String[] args) {
    System.out.println(MathOperations.calculateSum(1, 4));                 // Вызов (int, int)
    System.out.printf("%.2f\n", MathOperations.calculateSum(3.4, 5.8, 2.7)); // Вызов (double, double, double)
    System.out.println(MathOperations.calculateSum(3));                   // Вызов (int...)
  }
}
```

---

### Задача 2: `ValuePassAnalyzer.java`

**Цель:** Практическое подтверждение механики Pass-by-Value для примитивов, модификации состояния объектов и переприсвоения ссылок.

```java
package second_practice.advanced03.basics01.methods.practice;

public class User {
  private String name;

  public User(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
```

```java
package second_practice.advanced03.basics01.methods.practice;

public class ValuePassAnalyzer {
  // Попытка изменить значение примитива
  public static void modifyPrimitive(int x) {
    x = 99;
  }

  // Изменение внутреннего состояния объекта
  public static void modifyObjectState(User user) {
    user.setName("NewName");
  }

  // Попытка переприсвоить локальную копию ссылки
  public static void reassignReference(User user) {
    user = new User("Another user");
  }
}
```

```java
package second_practice.advanced03.basics01.methods.practiceMain;

import second_practice.advanced03.basics01.methods.practice.User;
import second_practice.advanced03.basics01.methods.practice.ValuePassAnalyzer;

public class ValueMain {
  public static void main(String[] args) {
    int number = 10;
    ValuePassAnalyzer.modifyPrimitive(number);
    System.out.println(number); // Выведет 10 (Примитив не изменился)

    User userFirst = new User("Alex");
    ValuePassAnalyzer.modifyObjectState(userFirst);
    System.out.println(userFirst.getName()); // Выведет "NewName" (Состояние объекта изменилось)

    User userSecond = new User("Bob");
    ValuePassAnalyzer.reassignReference(userSecond);
    System.out.println(userSecond.getName()); // Выведет "Bob" (Ссылка в main осталась прежней)
  }
}
```

---

### Задача 3: `RecursiveTracker.java`

**Цель:** Визуализация формирования и выгрузки фреймов стека вызовов с защитой от `StackOverflowError`.

```java
package second_practice.advanced03.basics01.methods.practiceMain;

public class RecursiveTracker {
  public static void printDepth(int currentDepth, int maxDepth) {
    // Базовый случай (Base Case)
    if (currentDepth > maxDepth) {
      System.out.println("-> Достигнута максимальная глубина (" + maxDepth + "). Возвращаемся назад!");
      return;
    }

    // Выполняется на этапе заполнения Call Stack
    System.out.println("Прямой ход: текущая глубина стека = " + currentDepth);

    // Рекурсивный шаг
    printDepth(currentDepth + 1, maxDepth);

    // Выполняется на этапе освобождения Call Stack
    System.out.println("Обратный ход: выходим из глубины = " + currentDepth);
  }

  public static void main(String[] args) {
    System.out.println("--- Старт рекурсии ---");
    printDepth(1, 5);
    System.out.println("--- Конец программы ---");
  }
}
```