//Map-2
// word0
// let hash = {};

// function word0(array){
//     array.sort();
//     for (const letter of array) {
//         hash[letter] = 0;
//     }
// }

// x = ["c", "b", "a"];

// word0(x);

// console.log(hash)


//wordCount

// function wordCount(array){
//     let hash = {};
//     for (const string of array) {
//         if (!(string in hash)){
//             hash[string] = 1;
//         }else{
//             let count = hash[string];
//             hash[string] = count + 1;
//         }
//     }
//     return hash;  
// }


// console.log(wordCount(["a", "b", "a", "c", "b"]));


//wordMultiple
// function wordMultiple(array){
//     let hash = {};
//     for (const string of array) {
//         if (!(string in hash)){
//             hash[string] = 1;
//         }else{
//             let count = hash[string];
//             hash[string] = count + 1;
//         }
//     }

//     for (const key in hash) {
//         if (hash[key] >= 2){
//             hash[key] = true;
//         }else{
//             hash[key] = false;
//         }
        
//     }

//     return hash;  
// }
// console.log(wordMultiple(["a", "b", "a", "c", "b"]));


//functional-2


//doubling
// function doubling(array){
//     for (let index = 0; index < array.length; index++) {
//         array[index] = array[index]*2;        
//     }

//     return array;
// }

// console.log(doubling([1,2,3]));


//square
// function square(array){
//     for (let index = 0; index < array.length; index++) {
//         array[index] = array[index]*array[index];        
//     }

//     return array;
// }

// console.log(square([1,2,3]));

//noX
// function noX(array){
//     for (let index = 0; index < array.length; index++) {
//         array[index] = array[index].replaceAll('x', '');
//     }

//     return array;
// }

// console.log(noX(["xxax", "xbxbx", "xxcx"]));