"use strict";

function extractPrice(priceStr) {
    let formattedPrice = priceStr.slice(1);
    let taxPrice = (formattedPrice * 1.1);

    formattedPrice = taxPrice.toFixed(2);
    formattedPrice = parseFloat(formattedPrice);
    return formattedPrice;
}


console.log(extractPrice('$1234.6767'));
console.log(typeof(extractPrice('$1234.6767')));
