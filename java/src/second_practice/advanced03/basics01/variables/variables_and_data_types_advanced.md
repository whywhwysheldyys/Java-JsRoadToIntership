# Java Core Advanced: Variables & Data Types

## 📚 Теоретический разбор (Advanced)

### 1. Stack vs Heap: Распределение памяти для типов данных
- **Примитивные типы (`byte`, `short`, `int`, `long`, `float`, `double`, `boolean`, `char`):**
  - Локальные примитивные переменные хранят свои непосредственные **значения прямо в Stack (стеке)**.
  - Поля экземпляра класса (*instance variables*) примитивных типов хранятся внутри соответствующего объекта в **Heap (куче)**.
- **Ссылочные типы (Объекты, Массивы, Строки):**
  - Переменная ссылочного типа, объявленная в методе, хранит в **Stack** только 32-битный или 64-битный адрес (указатель) на область памяти.
  - Сам объект или массив всегда располагается в **Heap**.
- **Структура памяти:**
  - **Stack (Стек):** Работает по принципу LIFO (*Last In, First Out*). Память выделяется и освобождается автоматически при входе/выходе из кадров вызова методов (*stack frames*).
  - **Heap (Куча):** Неупорядоченная область памяти для длительного хранения объектов. Управление памятью осуществляется Сборщиком мусора (*Garbage Collector*).

---

### 2. Приведение типов (Type Casting) и бинарное переполнение
- **Widening (Неявное расширение):** Переход от типа с меньшим диапазоном к большему (например, `int` $\rightarrow$ `long`). Потери данных не происходит, добавление старших битов с сохранением знака выполняется процессором автоматически.
- **Narrowing (Явное сужение):** Переход от большего типа к меньшему (например, `int` $\rightarrow$ `byte`). Требует явного указания приведения `(byte) myInt`.
- **Физический механизм переполнения:**
  - При сужении старшие биты числового представления просто отбрасываются (*bit truncation*).
  - Если в оставшихся младших битах самый старший разряд (знаковый бит в дополнительном коде *Two's Complement*) окажется равным `1`, то положительное в исходном типе число интерпретируется как отрицательное.
  - *Пример:* Число `300` в `int` $\rightarrow$ `00000000 00000000 00000001 00101100`. При приведении к `byte` остаются последние 8 бит: `00101100` ($44$).

---

### 3. Точность вычислений: Почему `float`/`double` неприменимы для финансов
- **Стандарт IEEE 754:** `float` и `double` используют двоичную систему с плавающей точкой (знак, экспонента, мантисса).
- **Проблема с дробными числами:** Десятичные дроби вроде `0.1` или `0.05` не могут быть точно представлены в виде конечной двоичной дроби (возникает периодическая дробь в двоичном коде), что приводит к накоплению погрешностей округления (например, `0.1 + 0.2` даёт `0.30000000000000004`).
- **Решение via `BigDecimal`:**
  - `BigDecimal` хранит произвольную точность целого числа (*unscaled value* типа `BigInteger`) и 32-битный масштаб (*scale*), показывающий количество знаков после запятой.
  - Конструирование **строго обязано** выполняться через `String` (`new BigDecimal("199.99")`), а не через `double`, чтобы избежать первоначальной потери точности.

---

### 4. Область видимости (Variable Scope) и жизненный цикл
| Тип переменной | Место объявления | Место хранения | Жизненный цикл |
| :--- | :--- | :--- | :--- |
| **Local Variables** | Внутри методов / блоков | Stack | Создаются при выполнении блока, уничтожаются сразу после выхода из блока. |
| **Instance Variables** | Внутри класса (без `static`) | Heap (внутри объекта) | Создаются при `new`, уничтожаются Garbage Collector'ом, когда на объект нет ссылок. |
| **Static Variables** | Внутри класса с модификатором `static` | Metaspace / Heap | Создаются при загрузке класса JVM, живут до выгрузки класса / завершения приложения. |

---

### 5. Ключевое слово `final` и граница иммутабельности
- Ключевое слово `final` делает **неизменяемой только саму ссылку / значение переменной**:
  - Для примитива: запрещает повторное присвоение другого значения.
  - Для объекта / массива: запрещает перенаправление ссылки на другой объект в Heap (`array = new int[10]; // Компиляция запрещена`).
- **Мутабельность состояния:** `final` **не делает** содержимое объекта или элементы массива неизменяемыми. Элементы `final int[] arr` можно свободно модифицировать (`arr[0] = 99; // Успешно`).

---

## 💻 Разбор практических задач

### Задача 1: `FinancialCalculator.java`
**Цель:** Точные финансовые вычисления с применением класса `BigDecimal` и правильного округления.

```java
package second_practice.advanced03.basics01.variables.practiceMain;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FinancialCalculator {
  public static void main(String[] args) {
    BigDecimal price = new BigDecimal("199.99");
    BigDecimal discountPercent = new BigDecimal("15.5");
    BigDecimal percentHundred = new BigDecimal("100.0");

    // Вычисление коэффициента скидки и суммы скидки
    BigDecimal discountX = discountPercent.divide(percentHundred, 4, RoundingMode.HALF_UP);
    BigDecimal discountSum = discountX.multiply(price);

    // Корректное вычитание скидки из исходной цены
    BigDecimal totalPrice = price.subtract(discountSum);
    BigDecimal roundedTotalPrice = totalPrice.setScale(2, RoundingMode.HALF_UP);

    System.out.println("Цена: " + price + "\n"
            + "Скидка: " + discountPercent + "% \n"
            + "Итоговая стоимость: " + roundedTotalPrice);
  }
}
```
**Ключевые моменты:**
- Передача строк `"199.99"` в конструктор `BigDecimal` предотвращает искажения плавающей точки.
- Использование методов `.subtract()` и `.multiply()` вместо базовых операторов `-` и `*`.
- Округление до 2 знаков через `.setScale(2, RoundingMode.HALF_UP)`.

---

### Задача 2: `OverflowAnalyzer.java`
**Цель:** Анализ явного сужающего приведения типов (*narrowing casting*) и демонстрация эффектов переполнения.

```java
package second_practice.advanced03.basics01.variables.practiceMain;

import java.util.Scanner;

public class OverflowAnalyzer {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Введите свое число: ");
    int originalValue = input.nextInt();

    short originalValueShort = (short) originalValue;
    byte originalValueByte = (byte) originalValue; // При числе > 127 происходит переполнение

    System.out.println("Исходное введеное число: " + originalValue + "\n"
            + "Результат приведения к short: " + originalValueShort + "\n"
            + "Результат приведения к byte: " + originalValueByte + "\n");
  }
}
```
**Ключевые моменты:**
- Чтение значений динамически через `Scanner`.
- Приведение к `byte` сжимает 32-битный `int` до 8 бит. Динамический диапазон `byte` составляет $[-128, 127]$. Всё, что выходит за его пределы, циклически передвигается по диапазону за счет отбрасывания старших бит.

---

### Задача 3: `SystemConfig.java`
**Цель:** Обеспечение полной инкапсуляции и иммутабельности ссылочных полей через механизмы защитного копирования (*Defensive Copying*).

```java
package second_practice.advanced03.basics01.variables.practiceMain;

import java.util.Arrays;

public class SystemConfig {
  private final String environment;
  private final int[] allowedPorts;

  // Конструктор с защитной копией входящего массива
  public SystemConfig(String environment, int[] allowedPorts) {
    this.environment = environment;
    this.allowedPorts = allowedPorts != null ? Arrays.copyOf(allowedPorts, allowedPorts.length) : null;
  }

  public String getEnvironment() {
    return environment;
  }

  // Геттер с защитной копией возвращаемого массива
  public int[] getAllowedPorts() {
    return allowedPorts != null ? Arrays.copyOf(allowedPorts, allowedPorts.length) : null;
  }

  public static void main(String[] args) {
    int[] myPorts = {80, 443, 8080};
    SystemConfig config = new SystemConfig("PRODUCTION", myPorts);

    System.out.println("Порты в конфигурации до изменений: " + Arrays.toString(config.getAllowedPorts()));

    // 1. Попытка изменения через внешний массив
    myPorts[0] = 3333;
    System.out.println("Порты в конфигурации (защищено конструктором): " + Arrays.toString(config.getAllowedPorts()));

    // 2. Попытка изменения через вызов геттера
    int[] hackedPorts = config.getAllowedPorts();
    hackedPorts[1] = 9999;
    System.out.println("Порты в конфигурации (защищено геттером): " + Arrays.toString(config.getAllowedPorts()));
  }
}
```
**Ключевые моменты:**
- Защитное копирование в **конструкторе** устраняет связь между внутренним полем и внешним массивом, переданным извне.
- Защитное копирование в **геттере** не позволяет модифицировать внутренний массив объекта через полученную ссылку.