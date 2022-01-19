# 4. TypeCasting
Created Thursday 29 October 2020

Implicit conversion order -** only the loss of precision is bad**
![](./4._TypeCasting/pasted_image.png)

* This is Simply int → float is the direction. This is different from C++, where casting goes both ways. Java is stricter in implicit casting.
* This happens during the 4 basic ops.
* Explicit cast syntax: (target) value; This is not like functional.
* Explicit cast works only for numerical types, and char(unicode gets modded into ASCII if smaller numerical types are used).


*****


* Lossy conversion is an error in Java. i.e int to long is okay but the opposite is not allowed, because we lose precison.


