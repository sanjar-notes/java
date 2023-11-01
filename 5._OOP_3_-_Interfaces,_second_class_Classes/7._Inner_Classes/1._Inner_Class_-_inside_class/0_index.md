# 1. Inner Class - inside class
Created Friday 07 August 2020

[./inner_classes](./1._Inner_Class_-_inside_class/inner_classes)

* It is possible to **nest** a class inside another in Java.
* **Why** do we have it: Useful for creating classes which don't make sense individually, e.g Gear doesn't make sense for a car out of a Gearbox. Makes the code easy to use.


*****


* Making innerclass objects:

	

![](./1._Inner_Class_-_inside_class/pasted_image.png)
Only the first one works.
Intuition for the syntax:

1. Gearbox.Gear - gear constructor is not visible outside even if public.
2. new Gearbox.Gear - Gear should not have a meaning outside of Gearbox(i.e by itself alone). It can be instantiated w.r.t to an instance only.
3. mcLaren is not a class, and methods are owned by the class, not the objects.


* mcLaren.new Gear() is clunky, but intuitive.
* Most of the time, this is not required, the class uses the inner-class, does not need our instantiation.
* Inner classes are generally kept private, making their instance, even w.r.t to an object, impossible to make.

![](./1._Inner_Class_-_inside_class/pasted_image001.png)
![](./1._Inner_Class_-_inside_class/pasted_image002.png)

* inner classes are a good example of strong composition.


