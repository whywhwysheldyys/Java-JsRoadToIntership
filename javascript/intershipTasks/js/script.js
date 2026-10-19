"use strict";

//Какое будет выведено значение: let x = 5; alert( x++ ); ?

// let x = 5;
// alert(++x);

//Чему равно такое выражение: [ ] + false - null + true ?

// console.log([] + false - null + true); // "" = [], [] + false =  "false"
//result : NaN

//Что выведет этот код: let y = 1; let x = y = 2; alert(x); ?

// let y = 1;
// let x = y = 2;
// alert(x);
//result: 2

//Чему равна сумма [ ] + 1 + 2?

// console.log([] + 1 + 2);
//result: конкатенация строк, [] - string, ответ 12

//Что выведет этот код: alert( "1"[0] )?

// alert( "1"[0] );
//result: 1

//Чему равно 2 && 1 && null && 0 && undefined ?

// console.log(2 && 1 && null && 0 && undefined);
//result: И запинается на лжи

//Есть ли разница между выражениями? !!( a && b ) и (a && b)?

// console.log(!!( 1 && 2 ) == (1 && 2));
//result: !! - булевый оператор

//Что выведет этот код: alert( null || 2 && 3 || 4 ); ?
           //3
//alert( null || 2 && 3 || 4 );


//a = [1, 2, 3]; b = [1, 2, 3]; Правда ли что a == b ?
// const a = [1, 2, 3];
// const b = [1, 2, 3];

// console.log(a == b);
//result: неправда

//Что выведет этот код: alert( +"Infinity" ); ?

//alert( +"Infinity" );
//result: Infinity

//Верно ли сравнение: "Ёжик" > "яблоко"?

// console.log("Ёжик" > "яблоко");
//result: false,смотреть в таблицу Юникод

//Чему равно 0 || "" || 2 || undefined || true || falsе ?

// console.log(0 || "" || 2 || undefined || true || falsе);
//result: true, тк ИЛИ запинается на true
