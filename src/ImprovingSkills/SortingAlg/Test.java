package ImprovingSkills.SortingAlg;

import java.util.Random;

public class Test {
    static void fillArr(int[] anArr){
        System.out.println("Before sorting: ");
        for (int i = 0; i < anArr.length; i++) {
            anArr[i] = new Random().nextInt(10) + 1;
            System.out.print(anArr[i] + " ");
        }
        System.out.println();
    }
    static void printArr(int[] anArr){
        for (int i = 0; i < anArr.length; i++) {
            System.out.print(anArr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] anArray = new int[10];
        fillArr(anArray);

        new BubbleSort().bubbleSort(anArray);

        fillArr(anArray);
        new SelectionSort().selectSort(anArray);

        fillArr(anArray);
        new InsertionSort().insertionSort(anArray);

        fillArr(anArray);
        QuickSort.quickSort(anArray, 0, anArray.length-1);
        printArr(anArray);
    }
}
