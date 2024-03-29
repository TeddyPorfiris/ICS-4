import express from 'express'

const app = express()

const PORT = process.env.PORT || 5000

//middleware (making sure our request and response is json)
app.use(express.json())


//create endpoint (routes)
//if they make a get request to the path /, we will send this response
app.get('/', (req, res)=> res.send('Hello World!'))

let students = [
    {id:1, name: 'Ted', age: 16},
    {id:2, name: 'Michael', age: 17},
    {id:3, name: 'Kyle', age: 14},

]

app.get('/api/students', (req, res)=> {
    res.send(students)
})

app.get('/api/students/:id', (req, res)=> {
    const student = students.find(s => s.id === parseInt(req.params.id))
    if (!student) return res.status(404).send('Student not found')
    res.send(student)
})

app.post('/api/students/:id', (req, res)=> {
    const student = {
        id: students.length + 1,
        name: req.body.name,
        age: req.body.age
    }

    students.push(student)
    res.send(student)
})

app.put('/api/students/:id', (req, res)=> {
    const student = students.find(s => s.id === parseInt(req.params.id))
    if (!student) return res.status(404).send('Student not found')

    student.name = req.body.name
    student.age = req.body.age
   
    res.send(student)
})


app.delete('/api/students/:id', (req, res)=> {
    const student = students.find(s => s.id === parseInt(req.params.id))
    if (!student) return res.status(404).send('Student not found')

    const index = students.indexOf(student)
    students.splice(index, 1)
    
    res.send(student)
})

//once app starts to listen to that port, console.log
app.listen(PORT, () => console.log(`Server started on PORT ${PORT}`))