import js from "@eslint/js";
import globals from "globals";
import prettierConfig from "eslint-config-prettier";

export default [
    js.configs.recommended,
    {
        files: ["**/*.js"],
        languageOptions: {
            ecmaVersion: "latest",
            sourceType: "module",
            globals: {
                ...globals.browser, // Все функции браузера (alert, prompt, document и т.д.)
                ...globals.node     // Все функции Node.js (console, process и т.д.)
            }
        },
        rules: {
            
            "no-unused-vars": "warn",          
            "no-console": "off",               
            "no-useless-assignment": "off",   
            "no-plusplus": "off",              
            "no-undef": "error"                
        }
    },
    prettierConfig 
];