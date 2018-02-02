package ImprovingSkills.SortingAlg;

public class BubbleSort {
    void bubbleSort(int[] anArray){
        System.out.println("BubbleSort:");
        for (int i = 0; i < anArray.length; i++) {
            for (int j = i; j <= anArray.length - 1; j++) {
                if (anArray[i] > anArray[j]){
                    int tmp = anArray[i];
                    anArray[i] = anArray[j];
                    anArray[j] = tmp;
                }
            }
        }
        Test.printArr(anArray);
    }
}
