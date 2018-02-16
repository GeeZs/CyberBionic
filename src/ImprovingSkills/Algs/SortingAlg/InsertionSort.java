package ImprovingSkills.Algs.SortingAlg;

public class InsertionSort {
    void insertionSort(int[] anArray){
        System.out.println("InsertionSort");
        int tmp;
        for (int i = 0; i < anArray.length; i++) {
            for (int j = i; j >= 0 && j != 0; j--) {
                if (anArray[j] < anArray[j-1] ){
                    tmp = anArray[j];
                    anArray[j] = anArray[j-1];
                    anArray[j-1] = tmp;
                }
            }
        }
        Test.printArr(anArray);
    }
}
///  1 2 3 4 5