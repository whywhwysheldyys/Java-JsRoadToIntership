"use strict"

function nameFormat(name) {
    const trimmed = name.trim();
    const formatted = trimmed[0].toUpperCase() + trimmed.slice(1).toLowerCase();

    return formatted;
}

console.log(nameFormat('  иВан  '));
console.log(nameFormat('алЕкСанДр'));
