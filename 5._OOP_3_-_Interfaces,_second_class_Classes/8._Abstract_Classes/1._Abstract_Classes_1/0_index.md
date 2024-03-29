# 1. Abstract Classes 1
Created Saturday 08 August 2020

**The Idea**

* We're going to talk about abstraction.
* An interface was a contract for a class.

We could just use List, makes it somewhat generic.
![](./1._Abstract_Classes_1/pasted_image.png) ![](./1._Abstract_Classes_1/pasted_image001.png)

* We could have changed even the String, by omitting it.

Most general.
![](./1._Abstract_Classes_1/pasted_image002.png)

*****

**Rules and definitions**

* Interfaces are by definition absract. But Java also allows for abstract classes. They can have abstract methods, but also have concrete methods too, **in contrast to an interface.**
* If the inheriting class has any method unimplemented, it too should be abstract. Otherwise it is said to be a *concrete *class. 
* Abstract classes cannot be **instantiated**.


*****

**Syntax**: Add abstract after the access modifier

1. For a class:

	public abstract Animal{}
	

2. For a function:

	public abstract void eat();
	
Note: 

* The unimplemented functions do exist, so they are technically overriden. 'Override' annotation must be used.
* Constructors do exist for abstract classes.

Abstract class - [./abstract_classes_1/src/Animal.java](./1._Abstract_Classes_1/abstract_classes_1/src/Animal.java)
Concrete class(inheriting) - [./abstract_classes_1/src/Dog.java](./1._Abstract_Classes_1/abstract_classes_1/src/Dog.java)

*****

Example of inheritance from abstract class which is itself abstract .

