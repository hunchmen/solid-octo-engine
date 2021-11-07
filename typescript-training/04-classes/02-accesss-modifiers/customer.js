"use strict";
var Customer = /** @class */ (function () {
    //constructor
    function Customer(theFirst, theLast) {
        this._firstName = theFirst;
        this._lastName = theLast;
    }
    Object.defineProperty(Customer.prototype, "firstName", {
        //getter / setter methods
        // public getFirstName(): string {
        //     return this.firstName;
        // }
        // public setFirstName(theFirst: string): void {
        //     this.firstName = theFirst;
        // }
        // public getLastName(): string {
        //     return this.lastName;
        // }
        //accessor for get and set method
        get: function () {
            return this._firstName;
        },
        set: function (value) {
            this._firstName = value;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Customer.prototype, "lastName", {
        get: function () {
            return this._lastName;
        },
        set: function (value) {
            this._lastName = value;
        },
        enumerable: false,
        configurable: true
    });
    return Customer;
}());
//now let use it
// myCustomer.firstName = 'Martin';
// myCustomer.lastName = 'Dixon';
// console.log(myCustomer.firstName);
// console.log(myCustomer.lastName);
//using backticks for constructor value
// console.log(`Fullname: ${myCustomer.firstName} ${myCustomer.lastName}`);
//using setter and getter function of the class customer
var myCustomer = new Customer("", "");
myCustomer.firstName = "John";
myCustomer.lastName = "Banasihan";
console.log(myCustomer.firstName);
// console.log(myCustomer.);
// console.log(myCustomer.firstName + " " + myCustomer.lastName); 
