# Сводный конспект: Модификатор `static` в Java

## 📑 Теоретический блок

### 1. Что такое `static`?

Модификатор **`static`** указывает на то, что элемент (поле, метод или блок) принадлежит **самому классу**, а не конкретному экземпляру (объекту) этого класса.

### 2. Ключевые элементы с модификатором `static`

1. **Статические поля (переменные класса):**
   * Существуют в единственном экземпляре для всех объектов данного класса.
   * Все объекты класса разделяют одну и ту же статическую переменную.
   * Часто используются для счетчиков объектов или глобальных настроек.

2. **Статические методы:**
   * Могут вызываться без создания объекта напрямую через имя класса (`ClassName.staticMethod()`).
   * **Ограничения:**
     * Не могут обращаться к нестатическим (`instance`) полям и методам напрямую (так как для них нет текущего объекта).
     * Не могут использовать ключевые слова `this` и `super`.

3. **Статические блоки инициализации (`static { ... }`):**
   * Выполняются **один раз** при первой загрузке класса в память JVM.
   * Используются для сложной инициализации статических полей.

4. **Утилитные классы (Utility Classes):**
   * Содержат только статические методы и константы (например, `java.lang.Math`).
   * Исповедуют паттерн с **приватным конструктором** (`private CustomUtils() {}`), чтобы предотвратить создание объектов класса через `new`.

### 3. Поведение `static` при наследовании (Сокрытие методов / Method Hiding)

* Статические методы **НЕ переопределяются** (`@Override`), а **скрываются** (`hiding`).
* Если у родительского и дочернего классов есть статические методы с одинаковой сигнатурой, то вызов метода через полиморфную ссылку (`Parent obj = new Child()`) вызовет метод класса, **указанного в типе ссылки (`Parent`)**, а не созданного объекта (`Child`).
* К статическим методам **не применяется динамическое связывание (полиморфизм)**.

---

## 💻 Практический блок: Задачи и Решения

### Задача 1: Автогенерация ID и счетчик пользователей (`User`)

#### Класс `User.java`

```java
package second_practice.advanced03.oop02.staticword.practice;

public class User {
    private static int totalUsersCount = 0;
    private int id;
    private String username;

    public User(String username) {
        this.username = username;
        totalUsersCount++;
        this.id = totalUsersCount;
    }

    public static int getTotalUsersCount() {
        return totalUsersCount;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }
}
```

#### Класс проверки `UserMain.java`

```java
package second_practice.advanced03.oop02.staticword.practiceMain;

import second_practice.advanced03.oop02.staticword.practice.User;

public class UserMain {
    public static void main(String[] args) {
        User bob = new User("Bob");
        User alice = new User("Alice");
        User oleg = new User("Oleg");

        System.out.println(bob.getUsername() + " " + bob.getId());
        System.out.println(alice.getUsername() + " " + alice.getId());
        System.out.println(oleg.getUsername() + " " + oleg.getId());

        System.out.println("Общее число пользователей: " + User.getTotalUsersCount());
    }
}
```

---

### Задача 2: Утилитный класс (`MathUtils`)

#### Класс `MathUtils.java`

```java
package second_practice.advanced03.oop02.staticword.practice;

public class MathUtils {
    public static final double PI = 3.14159;

    public static int factorial(int n) {
        if (n < 0) {
            System.out.println("Ошибка! Введите число больше или равное 0");
            return -1;
        }

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    private MathUtils() {}
}
```

#### Класс проверки `MathUtilsMain.java`

```java
package second_practice.advanced03.oop02.staticword.practiceMain;

import second_practice.advanced03.oop02.staticword.practice.MathUtils;

public class MathUtilsMain {
    public static void main(String[] args) {
        System.out.println("PI = " + MathUtils.PI);
        System.out.println("Факториал 5 = " + MathUtils.factorial(5));
        System.out.println("Число 5 простое? " + MathUtils.isPrime(5));
    }
}
```

---

### Задача 3: Демонстрация «скрытия» статических методов (`StaticHiding`)

#### Класс `Parent.java`

```java
package second_practice.advanced03.oop02.staticword.practice;

public class Parent {
    public static void showMessage() {
        System.out.println("Статический метод из Parent");
    }

    public void showInstanceMessage() {
        System.out.println("Обычный метод из Parent");
    }
}
```

#### Класс `Child.java`

```java
package second_practice.advanced03.oop02.staticword.practice;

public class Child extends Parent {
    public static void showMessage() {
        System.out.println("Статический метод из Child");
    }

    @Override
    public void showInstanceMessage() {
        System.out.println("Обычный метод из Child");
    }
}
```

#### Класс проверки `StaticMain.java`

```java
package second_practice.advanced03.oop02.staticword.practiceMain;

import second_practice.advanced03.oop02.staticword.practice.Child;
import second_practice.advanced03.oop02.staticword.practice.Parent;

public class StaticMain {
    public static void main(String[] args) {
        Parent obj = new Child();

        // Вызовется метод из Parent (сокрытие методов, привязка к типу ссылки)
        obj.showMessage(); 

        // Вызовется метод из Child (переопределение методов, динамический полиморфизм)
        obj.showInstanceMessage(); 
    }
}
```