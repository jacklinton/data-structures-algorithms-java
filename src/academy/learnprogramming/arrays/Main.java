package academy.learnprogramming.arrays;

public class Main {

    public static void main(String[] args) {
        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        int index = -1;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i]  == 7) {
                index = i;
                break;
            }
        }

        System.out.println("index = " + index);

        /*
        To retrieve an element from an array...
        1. Multiply the size of the element by its index
        2. get the start address of the array
        3. Add the start adress to the result of the multiplication
        x + i * y
         */

        /*
        O(1) Retrieving an element from an array, if you have the index, has a constant time complexity.
        O(n) If we don't know the index, the time complexity is linear.
        Add an element to a full array O(n)
        Add an element to the end of an array (has space) O(1)
        Insert or update an element at a specific index O(1)
        Delete an element by setting it to null O(1)
        Delete an element by shifting elements O(n)

        If the code requires a loop, it's going to be linear time, if it doesn't require a loop, it's constant.
         */
    }
}
