package ImprovingSkills.SearchingAlg;

public class BinarySearch {
    static int binSearch(int[] array, int key){
        int low = 0;
        int high = array.length - 1;
        while (low <= high){
            int midIndex = (low+high)/2;
            int midValue = array[midIndex];
            if (midValue < key){
                low = midIndex+1;
            }else if (midValue > key){
                high = midIndex-1;
            }else {
                return midIndex;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        System.out.println(binSearch(arr, 6));
    }
}
