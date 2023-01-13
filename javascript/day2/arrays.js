// join
let fruits = ["Banana", "Orange", "Lemon", "Apple", "Mango"];
//console.log(fruits.join())
// push
// fruits.push('kiwi'); //pushed string on to the array
// fruits.push(['Strawberry', 'Blueberry']); //pushed an array on to the array
// fruits.push(5); //pushed a number on to the array
//console.log(fruits.join());

//console.log(JSON.stringify(fruits))

// pop
//console.log(fruits.pop())
//console.log(fruits.join())
// shift

// console.log(fruits.join());
// console.log(fruits.shift());
// console.log(fruits.join());
// // unshift
// console.log(fruits.unshift('teddy'));
// console.log(fruits.join());


// concat
// fruits = fruits.concat(['Strawberry', 'Blueberry']); //joins array and creates new array
// console.log(JSON.stringify(fruits))


// // slice
// fruits = ["Banana", "Orange", "Lemon", "Apple", "Mango"];
// let citrus = fruits.slice(3);
// citrus = fruits.slice(1, 3);



// splice
fruits = ["Banana", "Orange", "Apple", "Mango", "Pineapple", "Cherry"];
fruits.splice(2, 1, "Lemon", "Kiwi"); //first number is where to remove and the 2nd number is how many to remove
console.log(fruits);

fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.splice(2, 2, "Lemon", "Kiwi");