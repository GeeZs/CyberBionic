package ImprovingSkills.Algs.SortingAlg;

public class SelectionSort {
    void selectSort(int[] anArray){
        System.out.println("SelectionSort: ");
        for (int i = 0; i < anArray.length; i++) {
            for (int j = i + 1; j < anArray.length; j++) {
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
