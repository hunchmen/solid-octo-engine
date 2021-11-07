"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Shape_1 = require("./Shape");
var Circle_1 = require("./Circle");
var Rectangle_1 = require("./Rectangle");
// let myShape = new Shape(10, 15);
// console.log(myShape.getInfo());
// let myCircle = new Circle(5, 10, 20);
// console.log(myCircle.getInfo());
// let myRectangle = new Rectangle(0, 0, 3,7);
// console.log(myRectangle.getInfo());
var myShape = new Shape_1.Shape(10, 15);
var myCircle = new Circle_1.Circle(5, 10, 20);
var myRectangle = new Rectangle_1.Rectangle(0, 0, 3, 7);
//declare an array of shapes.. initially empty
var theShapes = [];
//add the shapes to the array
theShapes.push(myShape);
theShapes.push(myCircle);
theShapes.push(myRectangle);
for (var _i = 0, theShapes_1 = theShapes; _i < theShapes_1.length; _i++) {
    var tempShapes = theShapes_1[_i];
    console.log(tempShapes.getInfo());
}
for (var i = 0; i < theShapes.length; i++) {
    console.log(theShapes[i].getInfo());
}
