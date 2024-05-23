// // Values to compare
// const num = 0;      // Falsy (number 0)
// const str = "";      // Falsy (empty string)
// const obj = {};      // Truthy (empty object)
// const arr = [];      // Truthy (empty array)
// const boolTrue = true; // Truthy (boolean true)
// const boolFalse = false; // Falsy (boolean false)
// const nullValue = null;  // Falsy (null)
// const undefinedValue = undefined; // Falsy (undefined)

// // Equality (==)
// if (num == false) {
//     console.log("num is falsy (coercion)"); // This gets logged
// }

// // Strict Equality (===)
// if (num === 0) {
//     console.log("num is strictly equal to 0"); // This gets logged
// }

// // Inequality (!=)
// if (str != "") {
//     console.log("str is not empty (coercion)");
// } else {
//     console.log("str is falsy (coercion)"); // This gets logged
// }

// // Strict Inequality (!==)
// if (obj !== null) {
//     console.log("obj is not null"); // This gets logged
// }

// // Logical AND (&&) 
// if (arr.length > 0 && obj) {
//     console.log("Both array and object are truthy");
// } else {
//     console.log("At least one is falsy"); // This gets logged
// }

// // Logical OR (||)
// if (boolTrue || boolFalse) {
//     console.log("At least one boolean is true"); // This gets logged
// }

// // Combining with Truthy/Falsy Checks
// if (nullValue) {
//     console.log("nullValue is truthy"); 
// } else {
//     console.log("nullValue is falsy"); // This gets logged
// }

// if (!undefinedValue) {
//     console.log("undefinedValue is falsy (negation)"); // This gets logged
// }

// // Key Points:

// // Truthy/Falsy: In JavaScript, values can be loosely evaluated as "truthy" (treated as true) or "falsy" (treated as false) in logical operations.
// // Falsy Values: false, 0, "" (empty string), null, undefined, NaN
// // All other values are truthy: true, 1, "hello", [], {}, functions, etc.
// // Equality (==) vs. Strict Equality (===):
// // ==: Allows type coercion (automatic type conversion) before comparison. This can lead to surprising results (e.g., 0 == false is true).
// // ===: Checks for both value and type equality. This is often preferred for more predictable behavior.
// // Logical Operators: && (AND), || (OR), ! (NOT)
// // &&: True only if both operands are truthy.
// // ||: True if at least one operand is truthy.
// // !: Flips the truthiness of a value (e.g., !true is false).
// // Important Note:

// // Always be cautious when relying on implicit truthy/falsy checks or using the loose equality operator (==). It's often safer to use explicit comparisons (===, !==) and explicit checks for specific values (e.g., if (value !== null && value !== undefined)).




// // // Function to check if a number is even
// // function isEven(num) {
// //     return num % 2 === 0;
// // }

// // // Function to check if a number is between 10 and 20
// // function isBetweenTenAndTwenty(num) {
// //     return num >= 10 && num <= 20;
// // }

// // // Function to check if a string is empty or not
// // function isNotEmptyString(str) {
// //     return str !== "";
// // }

// // // Function to check if a variable is truthy
// // function isTruthy(value) {
// //     return Boolean(value);
// // }


