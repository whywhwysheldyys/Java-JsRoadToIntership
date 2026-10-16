"use strict";

function checkSpam(text) {
    const formatted = text.trim().toLowerCase();

    if (formatted.includes('viagra') || formatted.includes('free')) {
        return true;
    } else {
      return false;
    }
}

console.log(checkSpam('qweqwe free qweqqwe'));
