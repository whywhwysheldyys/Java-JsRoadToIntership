# Сводный конспект: Модуль `modifiers` (Модификаторы доступа и состояния)

## 📑 Теоретический блок

### 1. Модификаторы доступа (Access Modifiers)

Определяют область видимости и уровень доступа к классам, полям и методам из других частей программы:

* **`private`** — доступен **только внутри текущего класса**. Самый высокий уровень защиты данных.
* **`package-private` (default / без модификатора)** — доступен **только внутри текущего пакета** (package).
* **`protected`** — доступен **внутри текущего пакета** и в **классах-наследниках** (`extends`), даже если они расположены в других пакетах.
* **`public`** — доступен **из любой точки проекта**.

### 2. Таблица видимости

| Модификатор | Внутри класса | Внутри пакета | Наследник (другой пакет) | Везде |
| :--- | :---: | :---: | :---: | :---: |
| `private` | ✅ | ❌ | ❌ | ❌ |
| *(default)* | ✅ | ✅ | ❌ | ❌ |
| `protected` | ✅ | ✅ | ✅ | ❌ |
| `public` | ✅ | ✅ | ✅ | ✅ |

### 3. Модификатор состояния `final`

* **Для полей:** значение задается один раз (в месте объявления или в конструкторе) и **не может быть изменено** в дальнейшем.
* **Для методов:** метод нельзя переопределить (`@Override`) в классах-наследниках.
* **Для классов:** класс становится **закрытым для наследования** (нельзя сделать `extends`).

---

## 💻 Практические задачи и решения

### Задача 1: `AccessAnalyzer` (Доступ между пакетами)

**Класс `Parent.java` (`packageA`):**
```java
package second_practice.advanced03.oop02.modifiers.practice.packageA;

public class Parent {
    private int privateVar = 10;
    int defaultVar = 20;
    protected int protectedVar = 30;
    public int publicVar = 40;
}
```

**Класс `Child.java` (`packageB`):**
```java
package second_practice.advanced03.oop02.modifiers.practice.packageB;

import second_practice.advanced03.oop02.modifiers.practice.packageA.Parent;

public class Child extends Parent {
    public void checkAccess() {
        // System.out.println(privateVar); // ОШИБКА: private виден только в Parent
        // System.out.println(defaultVar); // ОШИБКА: default виден только в packageA

        System.out.println(protectedVar);  // УСПЕШНО: доступен наследнику в другом пакете
        System.out.println(publicVar);     // УСПЕШНО: доступен везде
    }
}
```

**Класс `Unrelated.java` (`packageB`):**
```java
package second_practice.advanced03.oop02.modifiers.practice.packageB;

import second_practice.advanced03.oop02.modifiers.practice.packageA.Parent;

public class Unrelated {
    public void checkAccess() {
        Parent parent = new Parent();

        // parent.privateVar;   // ОШИБКА: private недоступен
        // parent.defaultVar;   // ОШИБКА: default недоступен из другого пакета
        // parent.protectedVar; // ОШИБКА: protected недоступен не-наследнику вне пакета

        System.out.println(parent.publicVar); // УСПЕШНО: public доступен
    }
}
```

---

### Задача 2: `ImmutableConfig.java` (Неизменяемый класс)

```java
package second_practice.advanced03.oop02.modifiers.practice;

public class ImmutableConfig {
    private final String appName;
    private final int maxUsers;

    public ImmutableConfig(String appName, int maxUsers) {
        this.appName = appName;
        this.maxUsers = maxUsers;
    }

    public String getAppName() {
        return appName;
    }

    public int getMaxUsers() {
        return maxUsers;
    }
}
```

---

### Задача 3: `BankAccount.java` (Безопасный счет)

```java
package second_practice.advanced03.oop02.modifiers.practice;

public class BankAccount {
    private final String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Введите корректную сумму для пополнения");
        } else {
            balance += amount;
            System.out.println("Ваш баланс пополнен на: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            System.out.println("Введите корректную сумму для снятия");
        } else {
            balance -= amount;
            System.out.println("Вы сняли сумму: " + amount);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
```