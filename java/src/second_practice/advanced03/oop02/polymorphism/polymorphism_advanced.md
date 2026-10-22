# Сводный конспект: Полиморфизм и оператор `instanceof` в Java

## 📑 Теоретический блок

### 1. Что такое полиморфизм?
**Полиморфизм** (*от греч. «много форм»*) — один из четырех фундаментальных принципов объектно-ориентированного программирования. В Java он позволяет использовать объекты с одинаковым интерфейсом или базовым классом без необходимости знать их точный тип на этапе компиляции.

Существует два вида полиморфизма:
1. **Статический полиморфизм (Compile-time) / Перегрузка методов (`Overloading`):**
   * Объявление в одном классе методов с одинаковым именем, но **различной сигнатурой** (разным типом, количеством или порядком параметров).
   * Выбор конкретного метода происходит на этапе **компиляции**.
2. **Динамический полиморфизм (Runtime) / Переопределение методов (`Overriding`):**
   * Изменение реализации метода родительского класса в классе-потомке с сохранением **точно такой же сигнатуры**.
   * Выбор вызываемого метода происходит во время **выполнения программы (runtime)** на основе фактического типа объекта в памяти.

---

### 2. Динамическое связывание (Dynamic Method Dispatch)
При создании объекта через полиморфную ссылку:
```java
Parent obj = new Child();
```
* **Тип ссылки (`Parent`):** определяет, какие методы и поля *доступны для вызова* через переменную `obj` на этапе компиляции.
* **Тип объекта в памяти (`Child`):** определяет, чья конкретно реализация переопределенного метода *выполнится* во время работы программы.

Если нестатический метод переопределен в `Child`, вызовется версия из `Child`.

---

### 3. Приведение типов (Casting) и оператор `instanceof`

#### Восходящее приведение (Upcasting)
Приведение от дочернего типа к родительскому. Происходит **автоматически (неявно)** и абсолютно безопасно:
```java
Animal animal = new Dog(); // Upcasting
```

#### Нисходящее приведение (Downcasting)
Приведение от родительского типа к конкретному дочернему. Требуется **явное приведение типов**:
```java
Dog dog = (Dog) animal; // Downcasting
```

#### Оператор `instanceof`
Служит для безопасной проверки типа объекта перед нисходящим приведением:
```java
if (animal instanceof Dog) {
    Dog dog = (Dog) animal;
    dog.bringStick(); // Вызов уникального метода
}
```
* Если `animal` ссылается на `null`, выражение `null instanceof ClassName` возвращает `false` (исключение не выбрасывается).

*Начиная с Java 16 доступен Pattern Matching для `instanceof`:*
```java
if (animal instanceof Dog dog) {
    dog.bringStick(); // Переменная dog автоматически приведена к типу Dog
}
```

---

### 4. Типичные ошибки и подводные камни

1. **`ClassCastException` в Runtime:**
   Возникает при попытке привести объект к несоответствующему типу без проверки через `instanceof`:
   ```java
   Animal animal = new Cat();
   Dog dog = (Dog) animal; // Вызовет ClassCastException!
   ```
2. **Попытка вызвать уникальный метод дочернего класса через ссылку родителя:**
   ```java
   Animal animal = new Dog();
   animal.bringStick(); // Ошибка компиляции! Тип Animal не знает про метод bringStick().
   ```
3. **Путаница со `static` методами:**
   Статические методы **не переопределяются**, а скрываются (`Method Hiding`). Для них применяется статическое связывание по типу ссылки, а не по типу объекта.

---

## 💻 Практический блок: Задачи и Решения

### Задача 1: Звуки животных (`Animal` -> `Dog`, `Cat`, `Cow`)

#### Иерархия классов

```java
package second_practice.advanced03.oop02.polymorphism.practice;

public class Animal {
    public void makeNoise() {
        System.out.println("Какое - то животное издает звук");
    }
}

public class Dog extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Гав - гав");
    }
}

public class Cat extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Мяу");
    }
}

public class Cow extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Му-у-у");
    }
}
```

#### Проверочный класс `AnimalMain.java`

```java
package second_practice.advanced03.oop02.polymorphism.practiceMain;

import second_practice.advanced03.oop02.polymorphism.practice.*;

public class AnimalMain {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog(),
                new Cat(),
                new Cow()
        };

        for (Animal animal : animals) {
            animal.makeNoise(); // Динамический полиморфизм
        }
    }
}
```

---

### Задача 2: Расчет зарплаты сотрудников (`Employee`)

#### Иерархия классов

```java
package second_practice.advanced03.oop02.polymorphism.practice;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double calculateMonthlyPay() {
        return 0.0;
    }
}

public class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public HourlyEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateMonthlyPay() {
        return hourlyRate * hoursWorked;
    }
}

public class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateMonthlyPay() {
        return monthlySalary;
    }
}
```

#### Проверочный класс `EmployeeMain.java`

```java
package second_practice.advanced03.oop02.polymorphism.practiceMain;

import second_practice.advanced03.oop02.polymorphism.practice.*;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee[] employees = {
                new HourlyEmployee("Oleg", 34.0, 45),
                new SalariedEmployee("Ilya", 1550.0)
        };

        for (Employee employee : employees) {
            System.out.println(employee.getName() + " зарплата: " + employee.calculateMonthlyPay());
        }
    }
}
```

---

### Задача 3: Проверка типов с `instanceof` (`ZooMain`)

#### Класс проверки `ZooMain.java`

```java
package second_practice.advanced03.oop02.polymorphism.practiceMain;

import second_practice.advanced03.oop02.polymorphism.practice.*;

public class ZooMain {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog(),
                new Cat(),
                new Cow(),
                new Dog()
        };

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Dog) {
                ((Dog) animals[i]).bringStick();
            } else if (animals[i] instanceof Cat) {
                ((Cat) animals[i]).catchMouse();
            } else {
                animals[i].makeNoise();
                System.out.println("Уникальных действий нет!");
            }
        }
    }
}
```