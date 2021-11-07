class  Customer {

    //properties
    //properties access level is public by default
    //private can be access only on its own class and subclasses
    private _firstName: string;
    private _lastName: string;

    //constructor
    constructor(theFirst: string, theLast: string) {
        this._firstName = theFirst;
        this._lastName = theLast;
    }

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
    public get firstName() : string {
        return this._firstName;
    }
    
    public set firstName(value: string) {
        this._firstName = value;
    }
    
    public get lastName() : string {
        return this._lastName;
    }
    
    public set lastName(value : string) {
        this._lastName = value;
    }
        

}

//now let use it


// myCustomer.firstName = 'Martin';
// myCustomer.lastName = 'Dixon';

// console.log(myCustomer.firstName);
// console.log(myCustomer.lastName);

//using backticks for constructor value
// console.log(`Fullname: ${myCustomer.firstName} ${myCustomer.lastName}`);

//using setter and getter function of the class customer
let myCustomer = new Customer("", "");
myCustomer.firstName = "John";
myCustomer.lastName = "Banasihan";
console.log(myCustomer.firstName);
// console.log(myCustomer.);
// console.log(myCustomer.firstName + " " + myCustomer.lastName); 