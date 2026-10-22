# Java Core Advanced: Control Flow (Управляющие конструкции)

## 📚 Теоретический разбор (Advanced)

### 1. `switch` vs `if-else`: Байт-код и оптимизация производительности

* **`if-else` цепочки:**
  * Проверки условий выполняются последовательно — сверху вниз.
  * В худшем случае сложная цепочка условий дает временную сложность $\mathcal{O}(N)$.
* **`switch` под капотом:**
  * Компилятор `javac` конвертирует `switch` в одну из двух инструкций байт-кода в зависимости от плотности значений кейсов:
    1. **`tableswitch`**: Исполняется, если значения кейсов последовательны (например, `1, 2, 3, 4`). Создается прямая таблица переходов (*jump table*), и переход к нужной ветке выполняется за постоянное время $\mathcal{O}(1)$.
    2. **`lookupswitch`**: Исполняется, если значения кейсов сильно разбросаны (например, `10, 100, 5000`). Компилятор строит упорядоченную таблицу и использует бинарный поиск, обеспечивая сложность $\mathcal{O}(\log N)$.

### 2. Метки в циклах (`Labeled break` & `continue`)

* **Механика:**
  * Обычные инструкции `break` и `continue` управляют исключительно текущим (самым внутренним) циклом.
  * Метки (`labelName:`) дают имя внешнему блоку или циклу, позволяя передавать управление напрямую на нужный уровень вложенности: `break labelName;` или `continue labelName;`.
* **Архитектурный контекст:**
  * Чрезмерное использование меток считается антипаттерном, так как создает ненаглядную логику («спагетти-код»), аналогичную оператору `goto`.
  * Однако для моментального выхода из глубоко вложенных структур (например, многомерных массивов) метки являются наиболее эффективным и читаемым инструментом.

### 3. Короткое замыкание (`Short-Circuit Evaluation`)

* **Логические операторы:**
  * `&&` (логическое И с коротким замыканием) и `||` (логическое ИЛИ с коротким замыканием).
  * В выражении `A && B`, если `A` дает `false`, правая часть `B` **не вычисляется**.
  * В выражении `A || B`, если `A` дает `true`, правая часть `B` **пропускается**.
* **Побитовые операторы:**
  * Одиночные `&` и `|` вычисляют обе части выражения **всегда**, вне зависимости от результата левого операнда.
* **Защита от `NullPointerException` (NPE):**
  * Порядок проверок слева направо позволяет безопасно обращаться к методам объектов:
    `if (user != null && user.getName() != null && !user.getName().isEmpty())`
  * Если `user` равен `null`, вычисление прерывается на первом шаге, избегая вызова методов у `null`-ссылки.

### 4. Эволюция конструкции `switch`

* **Исторические ограничения:** Поддерживались только типы `byte`, `short`, `char`, `int` и их обертки, а также `enum` и `String`.
* **Современные возможности (Java 14+):**
  * **Стрелочные кейсы (`->`):** Устраняют "проваливание" (*fall-through*), делая оператор `break` необязательным.
  * **`switch` как Expression (выражение):** Может возвращать значение напрямую.
  * **Ключевое слово `yield`:** Используется для возврата значения из многострочных блоков кода внутри кейса.

### 5. Итерация и изменение коллекций (`for-each`)

* **Механизм `for-each`:** Синтаксический сахар над `Iterator` для объектов, реализующих `Iterable`.
* **Причина `ConcurrentModificationException`:**
  * Изменение коллекции (добавление/удаление элементов через `list.remove()`) во время итерации напрямую меняет счетчик модификаций `modCount`.
  * Итератор проверяет совпадение `expectedModCount` и `modCount` на каждом шаге и выбрасывает исключение при обнаружении расхождений.
* **Безопасное удаление:** Использование `iterator.remove()` или метода `collection.removeIf(...)`.

---

## 💻 Разбор практических задач

### Задача 1: `SmartMenu.java`

**Цель:** Построение многоуровневого консольного меню с применением современного `switch` и выходом из вложенных циклов через `labeled break`.

```java
package second_practice.advanced03.basics01.controlflow;

import java.util.Scanner;

public class SmartMenu {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    mainMenu:
    while (true) {
      System.out.println("Открыть настройки - 1");
      System.out.println("О программе - 2");
      System.out.println("Выход из программы - 0");

      int userOpinion = input.nextInt();

      switch (userOpinion) {
        case 1 -> {
          while (true) {
            System.out.println("Изменить громкость - 1");
            System.out.println("Сменить язык - 2");
            System.out.println("Вернуться в главное меню - 0");

            userOpinion = input.nextInt();

            switch (userOpinion) {
              case 1 -> System.out.println("Громкость изменена");
              case 2 -> System.out.println("Язык изменен");
              case 0 -> {
                break mainMenu; // Мгновенный выход в корень через метку
              }
            }
          }
        }
        case 2 -> System.out.println("Программа: Умное Меню\nВерсия 1.0");
        case 0 -> {
          break mainMenu;
        }
      }
    }
  }
}
```

**Ключевые моменты:**
* Вложенная структура циклов `while` для управления сложным пользовательским сценарием.
* Использование стрелочного синтаксиса `switch (case ->)` предотвращает ошибки непреднамеренного выполнения нескольких веток.
* Применение `break mainMenu;` позволяет совершить мгновенный переход из внутреннего цикла настройки сразу на верхний уровень приложения.

---

### Задача 2: `MatrixSearch.java`

**Цель:** Оптимизированный поиск элемента в двумерной матрице с мгновенным прерыванием нескольких циклов.

```java
package second_practice.advanced03.basics01.controlflow;

import java.util.Scanner;

public class MatrixSearch {
  public static void main(String[] args) {
    int[][] matrix = {
            {5, 12, 17, 24},
            {9, 3, 42, 11},
            {8, 65, 19, 31}
    };

    Scanner input = new Scanner(System.in);
    System.out.println("Введите число для его поиска в матрице: ");
    int targetNum = input.nextInt();
    boolean found = false;

    searchLabel:
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] == targetNum) {
          found = true;
          System.out.println("Число найдено! \nКолонка: " + j + "\nСтрока: " + i);
          break searchLabel; // Прерывание обоих циклов одновременно
        }
      }
    }

    if (!found) {
      System.out.println("Такого числа нет в матрице.");
    }
  }
}
```

**Ключевые моменты:**
* Использование `matrix[i].length` гарантирует правильный обход колонок для каждой строки.
* Наличие метки `searchLabel` позволяет избежать сложных составных условий выхода во внешнем цикле или каскада флагов.
* Вынесение проверки итогового флага `found` за пределы циклов предотвращает заспамливание консоли сообщениями об ошибке на каждом шаге итерации.

---

### Задача 3: `ShortCircuitValidator.java`

**Цель:** Построение комплексного валидатора объектов с использованием короткого замыкания для защиты от `NullPointerException`.

```java
package second_practice.advanced03.basics01.controlflow.practice;

import java.util.List;

public class ShortCircuitValidator {

  public static boolean validateUser(User user) {
    // Каскадная цепочка проверок с коротким замыканием
    return user != null
            && user.getName() != null
            && !user.getName().isEmpty()
            && user.isActive()
            && user.getRoles() != null
            && !user.getRoles().isEmpty();
  }

  public static void main(String[] args) {
    User userFirst = new User("Ivan", true, List.of("Developer"));
    User userSecond = new User("", true, List.of("Developer"));
    User userNull = null;
    User userNullName = new User(null, true, List.of("Admin"));

    System.out.println("Валидный пользователь: " + validateUser(userFirst));       // true
    System.out.println("Пустое имя: " + validateUser(userSecond));             // false
    System.out.println("Null пользователь: " + validateUser(userNull));             // false (без NPE)
    System.out.println("Null имя пользователя: " + validateUser(userNullName));     // false (без NPE)
  }
}
```

**Ключевые моменты:**
* Проверки строятся по принципу "от общего к частному": сначала проверяется наличие объекта, затем наличие его полей, и только потом состояние этих полей (`!= null` перед `.isEmpty()`).
* Операторы `&&` гарантируют, что если левая часть вернет `false`, правая часть вычисляться не будет, обеспечивая 100% защиту программы от `NullPointerException`.
* Метод напрямую возвращает результат логического выражения без лишних конструкций `if-else`.