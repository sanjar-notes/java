# 2. Constructor
Created Monday 03 August 2020

**Constructor** - a function that runs when an object is created. It returns nothing, not even void.

#### Properties of constructors

1. Name is the same as class.
2. Returns nothing - return type is omitted completely.
3. There may be multiple constructors for the same class.
4. A Java constructor cannot be abstract(not inherited, no need), static(obvious), final(not inherited again, no need), and synchronized.


#### Use of constructors

* Can be used to set values based on conditions.
* Used to run other stuff which are required by the object.


#### Types of constructors
Java has only two types of constructors:

* Default(no-arg) constructor.
* Parameterized constructor - Takes parameters.


Note: The Java compiler will provides a default no-argument constructor, but only if no constructor have been defined(of any type).

#### Coding a constructor
![](./2._Constructor/pasted_image.png)

*****

How does the default constructor behave:

* It sets all state variables to their default value.
* Inline initialization runs before the constructor, but after static initialization blocks.

![](./2._Constructor/pasted_image001.png)

