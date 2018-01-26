package Arrays;

import java.util.Random;

public class App003ReversedArray {
    static int[] createArray(int length){
        System.out.println("Array: ");
        int[] arraY = new int[length];
        for (int i = 0; i < arraY.length; i++) {
            arraY[i] = new Random().nextInt(100);
            System.out.print(arraY[i] + " ");
        }
        return arraY;
    }
    static int[] myReverse(int[] anArray){
        System.out.println("Reversed array: ");
        int tmp = 0;
        int[] reversedArr = new int[anArray.length];
        for (int i = anArray.length - 1; i >= 0; i--) {
            reversedArr[tmp] = anArray[i];
            System.out.print(reversedArr[tmp] + " ");
            tmp++;

        }
        return reversedArr;
    }
    static int[] subArray(int[] anArray, int index, int count){
        System.out.println("Sub array: ");
        int[] subArray = new int[count];
        for (int i = 0; i < subArray.length; i++) {
            if (index <= anArray.length-1){
                subArray[i] = anArray[index];
            }else {
                subArray[i] = 1;
            }
            System.out.print(subArray[i] + " ");
            index++;
        }
        return subArray;
    }

    public static void main(String[] args) {
        int[] arr = createArray(10);

        System.out.println();

        arr = myReverse(arr);
        System.out.println();

        subArray(arr, 5, 10);

    }
}
