"use strict";

const defaultUser = {
    role: 'student',
    status: 'active',
    country: 'Belarus'
};

const specificUser = {
    name: 'Alex',
    age: 22,
    role: 'Intern'
};

const mergedUser = {
    ...defaultUser,
    ...specificUser
};

console.log("Обьединенный обьект:", mergedUser);

const {name, age, role} = mergedUser;

console.log(`Привет! Меня зовут ${name}, мне ${age} лет, моя текущая роль: ${role}.`)
