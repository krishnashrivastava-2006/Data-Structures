// Bubble sort algorithm
import java.util.Arrays;
//Best case : O(n)    array is already sorted
//worst case : O(n^2)   array is sorted in opposite
class A {
    public static void main(String[] args) {
        int[] x = {1,2,3,4,5};

        bubbleSort(x);

        System.out.println(Arrays.toString(x));
    }

    static void bubbleSort(int[] arr) {
        //run the loop n - 1 times
        for(int i = 0; i < arr.length; i++) {
            boolean isSwapped = false;

            //for each pass the largest element will be placed at last respective index
            for(int j = 1; j < arr.length - i; j++) {

                //swap if the item is smaller than the previous item
                if(arr[j] < arr[j-1]) {
                   isSwapped = true;
                   int temp = arr[j];
                   arr[j] = arr[j-1];
                   arr[j-1] = temp;
                }
            }
            // System.out.println("_--------");

            if(!isSwapped)
                break; // if array is already sorted then why run loop again and again
            
        }
    } 
}