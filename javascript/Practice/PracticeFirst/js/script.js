"use strict";

const userFavFilm = prompt("Скажите название своего любимого фильма"),
      userFilmRate = +prompt("Дайте оценку этому фильму(число)"),
      userFilmCount = +prompt("Напишите количество фильмов которые вы посмотрели");


const personalMovieDB = {
    count: userFilmCount,
    movies: {
        [userFavFilm]: userFilmRate
    }
};

if(userFilmCount < 10) {
    alert("Просмотрено довольно мало фильмов");
} else if (userFilmCount >= 10 && userFilmCount <= 30) {
    alert("Вы классический зритель");
} else if (userFilmCount > 30) {
    alert("Вы настоящий киноман");
} else {
    alert("Введите корректное число просмотренных фильмов")
}


console.log(personalMovieDB);