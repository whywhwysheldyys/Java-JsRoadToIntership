# Сводный конспект: Модуль `encapsulation` (Инкапсуляция)

## 📑 Теоретический блок

### 1. Что такое Инкапсуляция?
**Инкапсуляция (Encapsulation)** — это фундаментальный принцип ООП, заключающийся в сокрытии внутреннего устройства класса и защите его данных от неконтролируемого прямого изменения извне.

### 2. Ключевые правила реализации
1. **Приватные поля:** Все важные поля класса объявляются с модификатором доступа `private`.
2. **Контролируемый доступ:** Доступ к полям предоставляется через публичные методы — **геттеры** (`get...`) для чтения и **сеттеры** (`set...`) для изменения.
3. **Валидация данных:** Логика проверки корректности данных закладывается **внутрь сеттеров** или **конструктора**. Это гарантирует, что объект никогда не окажется в некорректном (невалидном) состоянии.
4. **Валидация в конструкторе:** Чтобы при создании объекта (`new`) нельзя было передать плохие данные, внутри конструктора рекомендуется вызывать соответствующие сеттеры.

---

## 💻 Практические задачи и решения

### Задача 1: `Car.java` (Валидация скорости)

**Класс сущности:**
```java
package second_practice.advanced03.oop02.encapsulation.practice;

public class Car {
    private String brand;
    private int speed;

    public Car(String brand, int speed) {
        this.brand = brand;
        setSpeed(speed); // Используем сеттер для валидации при создании
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            System.out.println("Значение скорость не может быть меньше 0!");
        } else {
            this.speed = speed;
        }
    }
}
```

**Класс проверки:**
```java
package second_practice.advanced03.oop02.encapsulation.practiceMain;

import second_practice.advanced03.oop02.encapsulation.practice.Car;

public class CarMain {
    public static void main(String[] args) {
        Car audi = new Car("Audi", 150);

        audi.setBrand("BMW");
        System.out.println(audi.getBrand());

        audi.setSpeed(-130); // Попытка установить некорректную скорость
        System.out.println(audi.getSpeed()); // Скорость останется прежней
    }
}
```

---

### Задача 2: `Student.java` (Валидация среднего балла)

**Класс сущности:**
```java
package second_practice.advanced03.oop02.encapsulation.practice;

public class Student {
    private String name;
    private double grade;

    public Student(String name, double grade) {
        this.name = name;
        setGrade(grade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade < 0.0 || grade > 10.0) {
            System.out.println("Введите корректный балл!");
        } else {
            this.grade = grade;
        }
    }
}
```

**Класс проверки:**
```java
package second_practice.advanced03.oop02.encapsulation.practiceMain;

import second_practice.advanced03.oop02.encapsulation.practice.Student;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student("Igor", 10.2); // Балл вне диапазоне от 0.0 до 10.0

        System.out.println(student.getGrade()); // Будет 0.0 (дефолтное значение)
    }
}
```

---

### Задача 3: `SimpleWallet.java` (Управление кошельком)

**Класс сущности:**
```java
package second_practice.advanced03.oop02.encapsulation.practice;

public class SimpleWallet {
    private double balance;

    public SimpleWallet(double balance) {
        setBalance(balance);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Ошибка! Введите корректное значение для баланса");
        } else {
            this.balance = balance;
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Ошибка! Введите корректную сумму для пополнения");
        } else {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            System.out.println("Введите корректную сумму для снятия со счета!");
        } else {
            balance -= amount;
        }
    }
}
```

**Класс проверки:**
```java
package second_practice.advanced03.oop02.encapsulation.practiceMain;

import second_practice.advanced03.oop02.encapsulation.practice.SimpleWallet;

public class WalletMain {
    public static void main(String[] args) {
        SimpleWallet walletFirst = new SimpleWallet(-100);
        SimpleWallet walletSecond = new SimpleWallet(0);

        System.out.println(walletFirst.getBalance()); // Выведет 0.0

        walletSecond.deposit(200);
        System.out.println(walletSecond.getBalance()); // Выведет 200.0
    }
}
```