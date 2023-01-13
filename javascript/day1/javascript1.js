/*
var greeting = 'hello';
// var is dangerous don't use var
// function test(){
if (true){
    var greeting = 'hi';
}
// }
*/

// let is very similar to how Java works (obeys scope and cannot redeclare)
/*
let greeting = 'hello';
// var is dangerous don't use var
function test(){
    if (true){
        let greeting = 'hi';
    }
}

console.log(greeting);

const TEST_VAlUE = 6;
TEST_VAlUE = 5;
*/


// == vs ===
// == compares the values === compares the value AND the datatype

// console.log(1 == '1'); //true
// console.log(1 === '1'); //false
// console.log(1 == true); //true. false is 0, 1 is true. so this is true
// console.log(1 === true); //false. though 1 and true both mean 1, 1 is a number and true is a boolean (different datatypes)
// console.log(typeof (1));
// console.log(typeof (true));


// !== compares values and type ensure that they are not the same

// let number1 = 6;
// let number2 = 7;
// let sum = number1 + number2;

// const result = number1 + " + " + number2 + " = " + sum;
// console.log(result);

// const result2 = `${number1} + ${number2} = ${sum}`;
// console.log(result2)

// function addTwo(x){
//     return x + 2;
// }

// console.log(addTwo(5));

// function add(x,y,z=0){
//     // return x + y + z;
//     return x + y + (typeof(z) === undefined ? 0 : z);
// }

// console.log(add(1,2,3)); //outputs 6
// // because we said z=0 as default, we don't always have to put a third parameter
// console.log(add(1,2)); //outputs 3


// let num = 7;

// //num%2==0 checks if num is even
// //?'even' means if true (even), output 'even'
// //:'odd' means if false (odd), output 'odd'

// console.log(num%2==0?'even':'odd');

// for (let index = 0; index < 7; index++) {
//     console.log(index);
// }

const colours = ['red', 'yellow', 'green', 'blue'];
// iterating through values in array
// for (const colour of colours) {
//     console.log(colour)
// }

// hashmap (dictionary)
const car = {make:'Ford', model:'Mustang'};


// use for in (not for of) to output keys and their respective values
for (const property in car) {
    console.log(`${property}: ${car[property]}`);
}

// different ways for outputing the value from the key of the hashmap
console.log(car.make);
console.log(car['make']);