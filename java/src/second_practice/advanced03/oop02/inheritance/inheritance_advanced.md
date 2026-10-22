# Сводный конспект: Наследование (Inheritance) и ключевое слово `super` в Java

## 📑 Теоретический блок

### 1. Что такое Наследование?
**Наследование (Inheritance)** — один из трех (четырех) ключевых принципов ООП, позволяющий создать новый класс (дочерний / класс-потомок) на основе существующего (родительского / базового класса).

* **Главная цель:** Реализация принципа **DRY** (*Don't Repeat Yourself* — Не повторяйся) и построение логических иерархий типов.
* **Синтаксис:** Используется ключевое слово `extends`.
  ```java
  public class Dog extends Animal { ... }
  ```

### 2. Ключевые особенности и ограничения в Java
1. **Единственное наследование классов:** В Java класс может наследоваться **только от одного** прямого родителя. Множественное наследование классов запрещено для избежания "проблемы ромба" (*Diamond Problem*).
2. **Иерархия `Object`:** Все классы в Java неявно наследуются от базового класса `java.lang.Object`.

### 3. Ключевое слово `super`
Служит для обращения к членам (полям, методам, конструкторам) родительского класса:
* **`super(...)`:** Вызов конструктора родительского класса. Должен быть **первой инструкцией** в конструкторе дочернего класса.
* **`super.methodName()`:** Вызов метода родительского класса, если он был переопределен в дочернем.

### 4. Переопределение методов (`@Override`) vs Перегрузка (Overloading)
* **Переопределение (`@Override`):** Изменение реализации метода родительского класса в дочернем. Сигнатура (имя, параметры, возвращаемый тип) остается строго одинаковой.
* **Перегрузка (Overloading):** Создание методов с одинаковым именем, но **разным набором параметров** в рамках одного или разных классов.

### 5. Модификатор доступа `protected`
Обеспечивает доступ к полям и методам класса:
1. Внутри самого класса.
2. Внутри текущего пакета (package-private).
3. **Во всех подклассах (наследниках)**, даже если они находятся в других пакетах.

---

## 💻 Практический блок: Задачи и Решения

### Задача 1: Иерархия сотрудников (`Employee`, `Manager`, `Developer`)

#### Базовый класс `Employee.java`
```java
package second_practice.advanced03.oop02.inheritance.practice;

public class Employee {
    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        setBaseSalary(baseSalary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary <= 0) {
            System.out.println("Ошибка! Зарплата не может быть меньше либо равна нулю.");
        } else {
            this.baseSalary = baseSalary;
        }
    }

    public double calculateSalary() {
        return baseSalary;
    }

    public void work() {
        System.out.println("Сотрудник работает");
    }
}
```

#### Дочерний класс `Manager.java`
```java
package second_practice.advanced03.oop02.inheritance.practice;

public class Manager extends Employee {
    private int managedProjectsCount;

    public Manager(String name, double baseSalary, int managedProjectsCount) {
        super(name, baseSalary);
        this.managedProjectsCount = managedProjectsCount;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (managedProjectsCount * 500);
    }

    @Override
    public void work() {
        super.work();
        System.out.println("Менеджер управляет проектами");
    }
}
```

#### Дочерний класс `Developer.java`
```java
package second_practice.advanced03.oop02.inheritance.practice;

public class Developer extends Employee {
    private String mainLanguage;

    public Developer(String name, double baseSalary, String mainLanguage) {
        super(name, baseSalary);
        this.mainLanguage = mainLanguage;
    }

    @Override
    public double calculateSalary() {
        if ("Java".equals(mainLanguage)) {
            return getBaseSalary() * 1.3;
        } else {
            return getBaseSalary();
        }
    }
}
```

#### Класс проверки `EmployeeMain.java`
```java
package second_practice.advanced03.oop02.inheritance.practiceMain;

import second_practice.advanced03.oop02.inheritance.practice.Developer;
import second_practice.advanced03.oop02.inheritance.practice.Manager;

public class EmployeeMain {
    public static void main(String[] args) {
        Manager manager = new Manager("Ivan", 325, 4);
        Developer developer = new Developer("Sergey", 1000, "Java");

        manager.work();
        developer.work();

        System.out.println("Зарплата менеджера: " + manager.calculateSalary());
        System.out.println("Зарплата разработчика: " + developer.calculateSalary());
    }
}
```

---

### Задача 2: Банковские счета (`BankAccount`, `CreditAccount`)

#### Базовый класс `BankAccount.java`
```java
package second_practice.advanced03.oop02.inheritance.practice;

public class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        setBalance(balance);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Введите корректное значение баланса.");
        } else {
            this.balance = balance;
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Введите корректную сумму для пополнения.");
        } else {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            System.out.println("Введите корректную сумму для снятия.");
        } else {
            balance -= amount;
        }
    }
}
```

#### Дочерний класс `CreditAccount.java`
```java
package second_practice.advanced03.oop02.inheritance.practice;

public class CreditAccount extends BankAccount {
    private double creditLimit;

    public CreditAccount(double balance, double creditLimit) {
        super(balance);
        this.creditLimit = -creditLimit;
    }

    @Override
    public void withdraw(double amount) {
        if ((balance - amount) < creditLimit) {
            System.out.println("Вы вышли за рамки овердрафта!");
        } else {
            balance -= amount;
        }
    }
}
```

#### Класс проверки `BankMain.java`
```java
package second_practice.advanced03.oop02.inheritance.practiceMain;

import second_practice.advanced03.oop02.inheritance.practice.BankAccount;
import second_practice.advanced03.oop02.inheritance.practice.CreditAccount;

public class BankMain {
    public static void main(String[] args) {
        BankAccount defaultAccount = new BankAccount(324.12);
        System.out.println("Обычный счет: " + defaultAccount.getBalance());

        CreditAccount creditAccount = new CreditAccount(320.0, 300);
        creditAccount.withdraw(500);
        System.out.println("Кредитный счет после снятия 500: " + creditAccount.getBalance());

        creditAccount.withdraw(300); // Превышение лимита
        System.out.println("Кредитный счет после попытки снять 300: " + creditAccount.getBalance());
    }
}
```

---

### Задача 3: Устройства (`Device`, `Smartphone`)

#### Базовый класс `Device.java`
```java
package second_practice.advanced03.oop02.inheritance.practice;

public class Device {
    private String model;
    protected boolean isOn;

    public Device(String model) {
        this.model = model;
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Устройство включено");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Устройство выключено");
    }
}
```

#### Дочерний класс `Smartphone.java`
```java
package second_practice.advanced03.oop02.inheritance.practice;

public class Smartphone extends Device {
    private int cameraMegapixels;
    private int batteryLevel;

    public Smartphone(String model, int cameraMegapixels, int batteryLevel) {
        super(model);
        this.cameraMegapixels = cameraMegapixels;
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void turnOn() {
        if (batteryLevel > 0) {
            super.turnOn();
        } else {
            System.out.println("Батарея разряжена, пожалуйста, зарядите устройство.");
        }
    }

    public void takePhoto() {
        if (isOn) {
            System.out.println("Щелк - Сделан фотоснимок");
        } else {
            System.out.println("Включите устройство, чтобы взаимодействовать с ним.");
        }
    }
}
```

#### Класс проверки `DeviceMain.java`
```java
package second_practice.advanced03.oop02.inheritance.practiceMain;

import second_practice.advanced03.oop02.inheritance.practice.Smartphone;

public class DeviceMain {
    public static void main(String[] args) {
        Smartphone iphone = new Smartphone("iPhone Pro Max 18", 50, 0);

        iphone.turnOn();
        iphone.takePhoto();
    }
}
```