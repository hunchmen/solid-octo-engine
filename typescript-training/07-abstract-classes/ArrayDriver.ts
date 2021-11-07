import { Shape } from "./Shape";
import { Circle } from "./Circle";
import { Rectangle } from "./Rectangle";

let myCircle = new Circle(5, 10, 20);
let myRectangle = new Rectangle(0, 0, 3,7)

//declare an array of shapes.. initially empty
let theShapes: Shape[] = [];

//add the shapes to the array
theShapes.push(myCircle);
theShapes.push(myRectangle);

for(let tempShapes of theShapes){
    console.log(tempShapes.getInfo());
    console.log(tempShapes.calculateArea());
}

// for(let i=0; i < theShapes.length; i++) {
//     console.log(theShapes[i].getInfo());
// }