# 4. Multiple Threads
Created Thursday 13 August 2020

Some output of [this code](./4._Multiple_Threads/multiple_threads/src/App.java) - both have a shared resource here
![](./4._Multiple_Threads/pasted_image001.png) ![](./4._Multiple_Threads/pasted_image.png) ![](./4._Multiple_Threads/pasted_image002.png)
Observations:

1. In picture 1, the output is nothing strange okay.
2. In picture 2, Thread 2 printed 10 and 9. Then it prepared its string(7 to be printed) by concatenation and was suspended. Thread 1 was active now, and it decremented and printed several times, effectively making the counter zero. Thread 2 became active and printed 7. The for loop had now ended as the counter is already 0. **The suspension point is not really lines of code, it can even be parts of the code, like for loop inside statements, println statement.**
3. In picture 3, everything goes as usual. Thread 1 prints 4 and reduces the counter to 3. Thread 2 prepares the string to be printed(3). Thread 1 takes over, reduces the counter to 2 and prints it. Thread 2 now becomes active and finished its print(3). It also decrements the counter to 1. Thread 1 then prints 1 and the for loop ends. Same as 2.

Condition 2 and 3 are known as race conditions.

* Atomicity is at stake if such changes take place.
* We need to stop race conditions while multithreading.


*****

Synchronized method - A method that can be run only by a single thread. To apply this to a method add synchronized after the access modifier.

* Don't use local variables for synchronization.


