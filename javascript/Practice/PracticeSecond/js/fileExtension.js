"use strict";

let firstFile = 'index.html';
function fileName(file) {
  // const formatted = file.trim().toLowerCase();
  // const dotPlace = formatted.indexOf('.');
  // const lastIndex = formatted.lastIndexOf();
  // const fileExtension = formatted.slice(dotPlace, lastIndex);
  // const fileName = formatted.slice(0, dotPlace);

  //Оптимизированное решение:

  const formatted = file.trim().toLowerCase();
  const dotPlace = formatted.indexOf('.');
  const fileExtension = formatted.slice(dotPlace + 1);
  const fileNameOnly = formatted.slice(0, dotPlace);

  return `Название файла:${fileNameOnly}  Расширение файла: ${fileExtension}`;
}


console.log(fileName(firstFile));
