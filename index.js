const express = require('express')
const axios = require('axios')
const ejs = require('ejs')
const mongoose = require('mongoose')
require("dotenv").config();
//const bodyParser = require("body-parser")
const Datastore = require ("nedb")


//const recipeSchema = new mongoose.Schema({
  //  id: {
    //    type: Number,
      //  require: true
    //}, title:{
      //  type:String,
        //require:true
  //  },image:{
    //    type: String,
      //  require:true
    //},imageType:{
      //  type:String,
        //require:true
    //}
//})



const app = express();
const key_api = "39b8bcd906f347db9791736323bb8177"
    //"1b59db1c46d248be81b76b9a825c61a0"

app.set('view engine', 'ejs')
app.use(express.static('public'))
app.use(express.urlencoded({extend:false}))



app.get('/', (req,res) =>{
    res.render('index')
})

app.post('/search',async (req,res)=>{
    const {query} = req.body;
    const response = await axios.get(`https://api.spoonacular.com/recipes/complexSearch?query=${query}&apiKey=${key_api}`)
    const recipes = response.data.results;
    res.render('results', {recipes})
})

app.get('/recipe/:id', async (req, res)=> {
    const {id} = req.params;
    const response = await axios.get(`https://api.spoonacular.com/recipes/${id}/information?apiKey=${key_api}`)
    const recipe = response.data;
    res.render('recipe', {recipe})

})


const PORT = 3001;

app.listen(PORT, ()=>{
    console.log('server is running')
})
const recipeSchema = new mongoose.Schema({
    id1: Number,
    title: String,
    image: String,
    imageType: String
});

const Recipe = mongoose.model('Recipe', recipeSchema);



app.use(express.json());

const port = 3002;
const uri = process.env.MONGODB_CONNECTION_STRING;

//.connect('mongodb+srv://matthewcollins6:CML185206@atlascluster.4n1uead.mongodb.net/?retryWrites=true&w=majority&appName=AtlasCluster',{});

const connection = mongoose.connection;
connection.once("open", () =>{
    console.log('MongoDB database connection established successfully.')
})

app.listen(port, ()=>{
    console.log('MongoDB server is running')
})
//app.listen(port, () => {
  //  console.log(`App is listening at https://localhost${port}`)
//});

