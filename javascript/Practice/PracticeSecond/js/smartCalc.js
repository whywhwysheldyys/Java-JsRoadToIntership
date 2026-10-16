"use strict";

// function doubleCalc(number) {
//     let formatted = Math.round(number);
//     if (formatted.typeOf('string')) {
//           parseInt(formatted);
//     }

//     return formatted;
// }


// console.log(doubleCalc(45.6789));


//Правильный вариант решения

function doubleCalc(number) {
  let formatted = number.toFixed(2);

  if (typeof formatted === 'string') {
      formatted = parseFloat(formatted);
  }

  return formatted;
}

console.log(doubleCalc(45.6789));
console.log(typeof doubleCalc(45.6789));
