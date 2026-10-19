# 📚 Шпаргалка по DOM-модели в JavaScript

---

## 1. 🔍 Получение элементов (DOM-селекторы)

Сохранение элементов со страницы в переменные для дальнейшей работы:

```javascript
// Поиск одного элемента по ID
const box = document.getElementById('box');

// Поиск по тегу (возвращает псевдомассив)
const btns = document.getElementsByTagName('button');
btns[1] // доступ ко второй кнопке

// Поиск по классу (возвращает псевдомассив)
const circles = document.getElementsByClassName('circle');

// Поиск всех элементов по CSS-селектору (поддерживает .forEach)
const hearts = document.querySelectorAll('.heart');

// Поиск самого первого элемента по CSS-селектору
const oneHeart = document.querySelector('.heart');

// Поиск родительского контейнера
const wrapper = document.querySelector('.wrapper');
```

---

## 2. 🎨 Изменение стилей

```javascript
// Изменение конкретного свойства (в camelCase)
box.style.backgroundColor = 'blue';
box.style.width = '500px';

// Изменение нескольких свойств одной строкой
box.style.cssText = 'background-color: blue; width: 500px';

// Применение стилей для коллекции через цикл forEach
hearts.forEach(item => {
    item.style.backgroundColor = 'blue';
});
```

---

## 3. 🛠️ Создание элементов в памяти

```javascript
// Создание нового тега (пока существует только в памяти)
const div = document.createElement('div');

// Добавление класса для стилизации
div.classList.add('black');
```

---

## 4. 📥 Вставка элементов на страницу

```javascript
// 1. В конец родительского элемента (современный способ)
wrapper.append(div);

// Устаревший аналог:
wrapper.appendChild(div);

// 2. В самое начало родительского элемента
wrapper.prepend(div);

// 3. Относительно других элементов
hearts[0].before(div); // Перед первым сердечком
hearts[0].after(div);  // После первого сердечка

// Устаревший способ вставки перед конкретным ребенком:
wrapper.insertBefore(div, hearts[1]);

// 4. Вставка HTML-строки относительно элемента
div.insertAdjacentHTML('afterend', '<h2>Hello</h2>');
```

---

## 5. ❌ Удаление и замена элементов

```javascript
// Полное удаление элемента со страницы
circles[0].remove();

// Устаревший способ удаления (родитель удаляет ребенка)
wrapper.removeChild(hearts[1]);

// Замена одного элемента на другой (современный)
hearts[0].replaceWith(circles[0]);

// Устаревший способ замены
wrapper.replaceChild(circles[0], hearts[0]);
```

---

## 6. 📝 Работа с текстом и содержимым

```javascript
// Вставка полноценного HTML-кода (теги распознаются)
div.innerHTML = "<h1>Hello world</h1>";

// Вставка исключительно текста (теги не парсятся, выводятся как есть)
div.textContent = "<h1>Hello World</h1>";
```