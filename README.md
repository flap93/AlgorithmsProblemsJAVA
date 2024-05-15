# AlgorithmsProblemsJAVA

Practice exercise to solve algorithms problems

<!--** DIFFERENCES BETWEEN TRADITION FOR LOOP AND FOR LOOP AKA FOR EACH -->

In Java, there are also different types of loops that can be used to iterate over data structures, with the traditional for loop and the enhanced for loop (often referred to as the "for-each" loop) being the most common. Here’s a breakdown of the differences between a traditional for loop and a for-each loop in Java:

Traditional for Loop
The traditional for loop is versatile and can be used to iterate over anything by specifying an initializer, a condition, and an increment expression.

for (initialization; condition; increment) {
// code to be executed
}

int[] arr = {1, 2, 3, 4, 5};

for (int i = 0; i < arr.length; i++) {
System.out.println(arr[i]);
}

Enhanced for Loop (For-Each Loop)

The enhanced for loop (for-each loop) is a simpler and more concise way to iterate over arrays and collections.

int[] arr = {1, 2, 3, 4, 5};

for (int element : arr) {
System.out.println(element);
}
