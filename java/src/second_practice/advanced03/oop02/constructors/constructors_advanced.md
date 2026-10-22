# Сводный конспект: Модуль `constructors` (Конструкторы в Java)

---

## 📑 Теоретический блок

### 1. Назначение конструктора
Конструктор — это специальный блок кода, вызываемый при создании объекта с помощью оператора `new`. 
* **Имя** обязательно совпадает с именем класса.
* **Возвращаемый тип** отсутствует (даже `void`).
* Выполняет инициализацию начального состояния объекта.

### 2. Конструктор по умолчанию (Default Constructor)
* Генерируется компилятором автоматически, если в классе **не объявлено ни одного** явного конструктора.
* Не имеет параметров и обладает пустым телом.
* При объявлении хотя бы одного пользовательского конструктора дефолтный автоматически отключается.

### 3. Цепочка конструкторов (`this(...)`)
* Используется для вызова одного конструктора из другого внутри того же класса.
* Позволяет задавать значения по умолчанию и исключает дублирование кода (принцип DRY).
* **Правило:** вызов `this(...)` обязан быть **строго первой строкой** в теле конструктора.

### 4. Порядок инициализации объекта
При вызове `new` порядок выполнения элементов следующий:
1. Инициализация полей значениями по умолчанию (`null`, `0`, `false`).
2. Инициализация полей явными значениями и выполнение нестатических блоков (`{ ... }`) в порядке их расположения в коде.
3. Выполнение тела конструктора.

---

## 💻 Практические задачи и решения

### Задача 1: `UserProfile.java` (Цепочка конструкторов)

```java
package second_practice.advanced03.oop02.constructors.practice;

public class UserProfile {
    private String username;
    private String email;
    private int age;
    private boolean isActive;

    public UserProfile(String username, String email, int age, boolean isActive) {
        this.username = username;
        this.email = email;
        this.age = age;
        this.isActive = isActive;
    }

    public UserProfile(String username, String email) {
        this(username, email, 18, true);
    }

    public UserProfile(String username) {
        this(username, "not_provided@mail.com");
    }

    public void displayInfo() {
        System.out.println("Имя пользователя: " + username + "\n"
                            + "Почта: " + email + "\n"
                            + "Возраст: " + age + "\n"
                            + "Активен ли: " + isActive);
    }
}
```

---

### Задача 2: `InitializationOrder.java` (Порядок инициализации)

```java
package second_practice.advanced03.oop02.constructors.practice;

public class InitializationOrder {
    private int a = print("1. Инциализация поля а");

    {
        System.out.println("2. Нестатический блок инициализации");
    }

    public InitializationOrder() {
        System.out.println("3. Выполнение конструктора");
    }

    public static int print(String msg) {
        System.out.println(msg);
        return 1;
    }
}
```

---

### Задача 3: `Book.java` (Конструктор копирования)

```java
package second_practice.advanced03.oop02.constructors.practice;

public class Book {
    private String title;
    private String author;
    private int pages;

    public Book() {
        this.title = "Unknown";
        this.author = "Anonymous";
        this.pages = 0;
    }

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.pages = other.pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void displayInfo() {
        System.out.println("Название книги: " + title + "\n"
                            + "Автор книги: " + author + "\n"
                            + "Количество страниц: " + pages);
    }
}
```