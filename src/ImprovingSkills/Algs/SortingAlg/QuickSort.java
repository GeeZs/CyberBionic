package ImprovingSkills.Algs.SortingAlg;


class QuickSort {
    /*void quickSort(int[] anArray, int startIndex, int endIndex){
        System.out.println("QuickSort: ");


        Test.printArr(anArray);
    }

    static int getPivotValue(int[] anArray, int startIndex, int endIndex){
        return anArray[anArray.length-1];
    }*/
    static void quickSort(int[] array, int low, int high) {

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }

}
