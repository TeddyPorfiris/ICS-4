const posts = [
    {title: 'Post One', body: 'This is post one'},
    {title: 'Post Two', body: 'This is post two'}
]

function getPosts() {
    setTimeout(() => {
        let output = '';
        posts.forEach((post, index) => {
            output += `<li>${post.title}</li>`;
        })

        document.body.innerHTML = output;
    }, 1000);
}


function createPosts(post){
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            posts.push(post)

            const error = false;
            if(!error)
                resolve();
            else
                reject('Error: something went wrong');
                
        }, 2000);
    })
}

// createPosts({ title: 'Post Three', body: 'This is post three'})
//calling createPosts. once createPosts done running, and if it was successful, then call getPosts
//     .then(getPosts)
//once createPosts done running, and if not successful, handle the error
//     .catch(err => console.log(err));


//Async/Await
//await waits for the asynchronous request to be made and then stores the response in res
// async function init(){
//     //waiting for this to be done before we call getPosts
//     await createPosts({ title: 'Post Three', body: 'This is post three'})

//     getPosts();
// }

// init();

//Async/Await with fetch
// async function fetchUsers(){
//     const res = await fetch('https://jsonplaceholder.typicode.com/users');

//     const data = await res.json();

//     console.log(data);

// }

// fetchUsers();


//Promise.all
// const promise1 = Promise.resolve('Hello World');
// const promise2 = 10;
// const promise3 = new Promise((resolve, reject) => setTimeout(resolve, 2000, 'Goodbye'));
// const promise4 = fetch('https://jsonplaceholder.typicode.com/users').then(res => res.json());

// Promise.all([promise1, promise2, promise3]).then((values) => console.log(values));



function fetchUsers(){
    //this will console.log response
    // fetch('https://jsonplaceholder.typicode.com/users').then((res) => {
    //     console.log(res.json())
    // });

    //this will not work because we are trying to JSON an empty promise (it takes time to get the data from https://jsonplaceholder.typicode.com/users. But here, since we didn't use .then or await, the code moves on even if the api didn't get a response yet. so it is trying to json an empty promise (response))
    let res = fetch('https://jsonplaceholder.typicode.com/users')
    console.log(res.json());
}