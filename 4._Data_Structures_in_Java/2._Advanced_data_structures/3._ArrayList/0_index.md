# 3. ArrayList
Created Tuesday 04 August 2020


* ArrayList is a resizable array. 
* It automatically grows in size. We don't need to worry about it. 

	import java.util.ArrayList;
	ArrayList<String> memo= new ArrayList<String>;	// declare


* Add to the right → memo**.add**("power");
* Add anywhere(contiguos only) → memo**.add**(position, "power");
* Add replace an existing position → memo**.set**(0, "power2");
* Access the ith element → memo**.get**(0);
* Remove an existing position → memo**.remove**(2), all elements slide to the left by one. It also works if we directly pass the item..
* checking if an item exists → memo**.contains**(item) returns true/false
* memo**.indexOf**(item) → returns the index of the item if it exists, otherwise returns -1.
* **.size**() function to acess size of the arrayList.


*****


![](./3._ArrayList/pasted_image.png)

*****


[./arrayList_intro.java](./3._ArrayList/arrayList_intro.java)

[./challenge](./3._ArrayList/challenge)

