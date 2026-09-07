//.....Selection Sort
//not stable sorting
//worst case time complexity : O(n^2)
//Best case time complexity : O(n^2)
// select maximum element at each step and place it at its correct index
import java.util.Arrays;

class A {
    public static void main(String[] args) {
        int[] x = {4,67,3,6,9,2,5,6};
        System.out.println("Unsorted : " + Arrays.toString(x));

        selectionSort(x);

        System.out.println("Sorted : " + Arrays.toString(x));
    }

    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            
            //find the maximum element in the remaining array
            int maxIndex = 0;
            for(int j = 1; j < n - i; j++) {
                if(arr[j] > arr[maxIndex])
                    maxIndex = j;
            }

            //swap the maximum element with its correct sorted position
            int temp  = arr[maxIndex];
            arr[maxIndex] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
    }

    
}