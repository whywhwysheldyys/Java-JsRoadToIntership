"use strict";

const isLoggedIn = confirm("Авторизованы ли вы?");
const hasSubscription = confirm("Есть ли у вас подписка?");
const isBanned = confirm("Заблокирован ли ваш аккаунт?");

if (isLoggedIn == true && hasSubscription == true && !isBanned) {
    alert("Добро пожаловать в закрытый клуб!");
} else {
    alert("Доступ запрещен!")
}