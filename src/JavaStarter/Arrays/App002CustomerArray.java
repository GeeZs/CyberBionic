package JavaStarter.Arrays;

import java.util.Random;
import java.util.Scanner;

public class App002CustomerArray {
    static int[] createArray(int length){
        int[] arraY = new int[length];
        for (int i = 0; i < arraY.length; i++) {
            arraY[i] = new Random().nextInt(100);
            System.out.print(arraY[i] + " ");
        }
        return arraY;
    }
    static void findMax(int[] anArr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < anArr.length; i++) {
             if (anArr[i] > max){
                 max = anArr[i];
             }
        }
        System.out.println("Max value: " + max);
    }
    static void findMin(int[] anArr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < anArr.length; i++) {
            if (anArr[i] < min){
                min = anArr[i];
            }
        }
        System.out.println("Min value: " + min);
    }
    static void findSum(int[] anArr){
        int sum = 0;
        for (int i = 0; i < anArr.length; i++) {
            sum += anArr[i];
        }
        System.out.println("The sum of array elements: " + sum);
    }
    static void arithmeticMean(int[] anArr){
        int sum = 0;
        for (int i = 0; i < anArr.length; i++) {
            sum += anArr[i];
        }
        System.out.println("The arithmetic mean of the array elements: " + sum / anArr.length);
    }
    static void findOdd(int[] anArr){
        System.out.print("The odd elements of the array:");
        for (int i = 0; i < anArr.length; i++) {
            if (anArr[i] % 2 == 0){
                System.out.print(" " + anArr[i]);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Type the array length: ");
        int n = new Scanner(System.in).nextInt();
        int[] anArray = createArray(n);
        System.out.println();

        findMax(anArray);
        findMin(anArray);
        findSum(anArray);
        arithmeticMean(anArray);
        findOdd(anArray);



    }
}
