// touchstart
// touchmove
// touchend
// touchenter
// touchleave
// touchcancel

window.addEventListener('DOMContentLoaded', () => {
    const box = document.querySelector('.box');

    box.addEventListener('touchstart', (e) => {
        e.preventDefault();

        console.log('Start');
        console.log(e.touches);
    });

    // box.addEventListener('touchmove', () => {
    //     e.preventDefault();

    //     console.log('Move');
    // });

    // box.addEventListener('touchend', () => {
    //     e.preventDefault();

    //     console.log('End');
    // });
});

// touches
// targetTouches
// changedTouches
