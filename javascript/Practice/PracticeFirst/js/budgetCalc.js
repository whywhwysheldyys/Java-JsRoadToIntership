"use strict";

const dayFoodBudget = +prompt("Какой ваш дневной бюджет на еду?");
const dayBudget = +prompt("Сколько вы тратите в день?");

let dayBudgetRemain = dayFoodBudget - dayBudget;

if (dayBudgetRemain < 0) {
    alert("Внимание вы уходите в минус!");
} else if (dayBudgetRemain >= 0 && dayBudgetRemain <= 500) {
    alert("Бюджет впритык, будьте аккуратнее");
} else if (dayBudgetRemain > 500) {
    alert("Отличный запас на день!")
} else {
    alert("Введите корректное число");
}