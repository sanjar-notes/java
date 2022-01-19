# zMisc
Created Saturday 01 August 2020


* Typecast is off for all except for toDouble. 
* String + data_type, here data_types will be converted to string, for easy conversion.
* Referencing is done for non-primitive type assignments. Just like Python3.

	Animal o1 = new Animal("Anim 1");
	Animal o2 = o1;
	o1.nickName = "bubba";
	System.out.println(o2.nickName);	// prints bubba



* Field values can be intialized outside of constructors(both static and non-static), but this is not a good practice,
* We can have multiple classes in Java in a single file, but there can only be one public class in a file, and this public class must have a main function.
* For -∞ and +∞, use Integer.MIN_VALUE and Integer.MAX_VALUE respectively. No import needed.
* string_1.compareTo("string_2") compares string 1 and string 2, returns string_1-string_2.
	1. + ve if - string 1 appears after string2 ASCII order
	2. -ve
	3. 0 (the same)

equivalent of strcmp(in C++)

* string_var.isEmpty() checks if the string is empty
* do ""+val in place of toString()
* Integer.parseInt(string_int) returns an integer. Same for double and float strings.
* Java uses call by value at all* times. Here's the gotcha - It does so clearly for primitive types, but for others the call is effectively call by reference(address is copied).
* main is a reserved keyword.
* The default == checks equality of reference. equals() checks bit by bit value.
* == works the same as equals for all primitive data types(autoboxed too except Double).
* equals() has been implemented for all primitive types and the String type.
* String_name.split(sep) - returns an array of String after splitting w.r.t sep


