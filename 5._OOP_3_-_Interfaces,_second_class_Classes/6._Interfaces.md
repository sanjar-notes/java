# 6. Interfaces
Created Wednesday 05 August 2020

Interfaces - purely(no method definitions whatsoever) abstract classes.

#### Interface Basics

* Interfaces consist of non-``private`` fields and ``public`` function declarations.
* All the methods must be implemented in the implementing(subclass) class. 

Tip: Keep empty functions for unrequired functions. Interface is a binding contract.

* In the interface, no modifiers like public or private are required. Everything is public abstract. Fields are static and final.
* Interface objects can be assigned different values(of the implemented classes).
* Java **does not allow** multiple inheritance with classes, but it can be achieved by implementing multiple interfaces for our class. **Syntax** - Seperate the interface name by commas.
* When doing both inheritance and interfaces, specify the inheritance first. The other way gives an error.

![](./6._Interfaces/pasted_image.png) OK
![](./6._Interfaces/pasted_image001.png) error

* Override annotation must be used while implementing interface methods.


*****


* We can make a reference of an interface(But not the object of it).

	public static void main(String[] args)
	{	
		Itelephone phone; // Itelephone is implemented by deskPhone and cellPhone
		phone = new deskPhone(); // can refer to an object of class deskPhone
		phone.call(123);
		
		phone = new cellPhone(): // can also refer to an object of class cellPhone
		phone.turnOn();
		phone.call(123)
	}


* This use of interface params help us to use multiple data types(compatible).

	public void f(ITelephone phone)
	{
		// code
	}
	
	f(deskPhone object);	// works
	f(cellPhone object);	// works


* Helps us do some **generic** programming.
* Inteface reference objects can also be cast into any of the implementing classes.


*****


* Inheritance vs Interface - check the implementing class vs the base class/interface.

e.g cellphone and deskphone - a superclass is not a good idea because a cellphone can do much more than just dial and recieve calls. So a cell phone is not just a phone. A cell phone just implements the phone inteface.

* Interface vs Instance - Choose an instance if you only want class only methods.

[./interfaces](./6._Interfaces/interfaces)
[./challenge_1](./6._Interfaces/challenge_1)
Note: An interface can extend another interface.

*****


### Variables in interfaces

* Variable inside interfaces are implicitly public, static and final. They are basically constant.


