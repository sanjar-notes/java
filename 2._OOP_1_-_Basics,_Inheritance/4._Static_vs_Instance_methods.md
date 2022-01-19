# 4. Static vs Instance methods
Created Monday 03 August 2020

**Static methods**

* Static methods are declared using the static modifier.
* Static methods cannot access instance methods and instance variables directly(they can indirectly, by first making an object).
* They are used for operations that don't require any data from an instance of the class(they cannot use **this**).
* main is a static method. It is called by the JVM as soon as the file is run.

![](./4._Static_vs_Instance_methods/pasted_image.png)

**Instance Methods**

* All non static methods are instance methods.
* Instance methods can access instance variables, instance methods as well as static variables and static methods.
* Static methods can access private static variables and static methods of objects of the same class.


*****

Deciding between static and instance?
![](./4._Static_vs_Instance_methods/pasted_image001.png)

