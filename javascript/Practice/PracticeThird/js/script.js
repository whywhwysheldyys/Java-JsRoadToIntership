"use strict";

function analyzeComment (text) {
    let clearedText = text.trim().toLowerCase();

    if (clearedText.includes("spam") || clearedText.includes("реклама")) {
        return `Спам обнаружен!`;
    } else {
      return `Комментарий прошел проверку. Длина: ${text.length}`
    }
}

console.log(analyzeComment('Hello'));
