import {express} from "express";
const app = express();
const port = process.env.port || 8080;

app.listen(port,()=>{
    console.log(`Running on port ${port}`);
});