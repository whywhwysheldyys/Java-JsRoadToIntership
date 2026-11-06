window.addEventListener('DOMContentLoaded', () => {
    const tabs = require('./modules/tabs'),
          timer = require('./modules/timer'),
          slider = require('./modules/slider'),
          calc = require('./modules/calc');

    tabs();
    timer();
    slider();
    calc();
});
