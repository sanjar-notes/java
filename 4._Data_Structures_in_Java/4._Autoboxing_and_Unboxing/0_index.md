# 4. Autoboxing and Unboxing
Created Tuesday 04 August 2020


* We need a class in order to create data structures. i.e ArrayList<int> doesn't work. This is because int is not a proper class.
* All primitive types have an equivalent class type. We've got Byte, Integer, Double, Character, Boolean etc. **All are in title case and in full form(int → Integer).**
* We can work with them just like the primitive types.
* Autoboxing - primitive to class → Integer.valueOf(i); // applying(autoboxing) wrapper
* Unboxing - class to primitive → I.intValue(); // removing(unboxing) wrapper
* Autoboxing and unboxing happens implicitly.

	Integer I = 56; // RHS executed as Integer.valueOf(56) automatically
	int i = I; // RHS executed as I.intValue() automatically


* Primitives are more efficient as compared to the autoboxed versions.


