package Arrays;

import java.util.Random;

public class App004UserArray {
    static int[] addToEnding(int[] anArray){
        System.out.println("Adding a number to the end of an array: ");
        int[] arr = new int[anArray.length + 1];
        for (int i = 0; i < anArray.length; i++) {
            arr[i] = anArray[i];
        }
        return arr;
    }
    static int[] addToBegining(int[] anArray, int value){
        System.out.println("Adding a number to the beginning of an array: ");
        int[] arr = new int[anArray.length + 1];
        arr[0] = value;
        for (int i = 1; i < anArray.length + 1; i++) {
            arr[i] = anArray[i - 1];
        }
        return arr;
    }
    static int[] createArray(int length){
        System.out.println("Created array: ");
        int[] arraY = new int[length];
        for (int i = 0; i < arraY.length; i++) {
            arraY[i] = new Random().nextInt(100);
        }
        return arraY;
    }
    static void printArray(int[] anArray){
        for (int i = 0; i < anArray.length; i++) {
            System.out.print(anArray[i] + " ");
        }
        System.out.println();
        System.out.println("Size: " + anArray.length);
    }

    public static void main(String[] args) {
        int[] anArray = createArray(10);

        printArray(anArray);
        printArray(addToEnding(anArray));
        printArray(addToBegining(anArray, new Random().nextInt(100)));

    }

}
