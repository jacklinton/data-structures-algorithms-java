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

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
        /* To retrieve an element from an array...
        1. Multiply the size of the element by its index
        2. get the start address of the array
        3. Add the start adress to the result of the multiplication
        x + i * y
         */
    }
}
