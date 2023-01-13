const companies = [
    { name: "Company One", category: "Finance", start: 1981, end: 2004 },
    { name: "Company Two", category: "Retail", start: 1992, end: 2008 },
    { name: "Company Three", category: "Auto", start: 1999, end: 2007 },
    { name: "Company Four", category: "Retail", start: 1989, end: 2010 },
    { name: "Company Five", category: "Technology", start: 2009, end: 2014 },
    { name: "Company Six", category: "Finance", start: 1987, end: 2010 },
    { name: "Company Seven", category: "Auto", start: 1986, end: 1996 },
    { name: "Company Eight", category: "Technology", start: 2011, end: 2016 },
    { name: "Company Nine", category: "Retail", start: 1981, end: 1989 }
 ];
 
 const ages = [33, 12, 20, 16, 5, 54, 21, 44, 61, 13, 15, 45, 25, 64, 32];
 
// for(let i=0; i<companies.length; i++){
//     console.log(companies[i]);
// }


//forEach
// companies.forEach(function(company){
//     console.log(company.name);
// });


// filter

//gets ages 21 and older
//without filter
// let canDrink = [];
// for(let i=0; i<ages.length; i++){
//     if(ages[i] >= 21){
//         canDrink.push(ages[i]);
//     }
// }


//with filter (no arrow)

// const canDrink = ages.filter(function(age) {
//     if(age >= 21){
//         return true;
//     }
// });

// with filter (arrow)
// const canDrink = ages.filter(age => age >= 21);
// console.log(canDrink);

//filter retail companies

// const retailCompanies = companies.filter(function(company){
//     if(company.category === 'retail'){
//         return true;
//     }
// });

// const retailCompanies = companies.filter(company => company.category === 'Retail');

// console.log(retailCompanies);

//get 80s companies

// const eightiesCompanies = companies.filter(company => (company.start >= 1980 && company.start < 1990));
// console.log(eightiesCompanies);

//get companies that lasted 10 years or more

// const lastedTenYears = companies.filter(company => (company.end - company.start >= 10))
// console.log(lastedTenYears);


//map

//create array of company names
// const companyNames = companies.map(function(company) {
//     return company.name;
// });

// console.log(companyNames);

// const testMap = companies.map(company => `${company.name} [${company.start} - ${company.end}]`);

// console.log(testMap);

// const agesSquare = ages.map(age => Math.sqrt(age));

// console.log(agesSquare);

//sort

//sort companies by start year
// const sortedCompanies = companies.sort(function(c1, c2){
//     if(c1.start > c2.start){
//         return 1;
//     }else{
//         return -1;
//     }
// });

// const sortedCompanies = companies.sort((a, b) => (a.start > b.start ? 1 : -1))

// console.log(sortedCompanies);


//sort ages from smallest to largest
// const sortAges = ages.sort((a, b) => a - b);

// console.log(sortAges);



//reduce
//reduce() method returns a single value: the function's accumulated result


//adding all years up
// const ageSum = ages.reduce(function(total, age){
//     return total + age;
// }, 0) //total starting at 0

// const ageSum = ages.reduce((total, age) => total + age, 0); //total starting at 0

// console.log(ageSum);


//get total years for all companies

// const totalYears = companies.reduce(function(total, company){
//     return total + (company.end - company.start);
// }, 0);


// const totalYears = companies.reduce((total, company) => total + (company.end - company.start), 0);

// console.log(totalYears);

//combine methods

const combined = ages
    //gives array of all ages * 2
    .map(age => age*2)
    //filter out ages less than 40
    .filter(age => age >= 40)
    // sort ages from lowest to highest
    .sort((a, b) => a - b)
    .reduce((a, b) => a + b, 0);


console.log(combined);