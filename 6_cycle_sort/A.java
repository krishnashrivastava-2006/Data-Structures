//Cycle Sort
import java.util.Arrays;
class A {
    public static void main(String[] args) {
        int[] x = {9,8,7,6,5,4,3,10,11,13,12,2,1};
        System.out.println("Sorted Array = " + Arrays.toString(x));

        cycleSort(x);
        System.out.println("Unsorted Array = " + Arrays.toString(x));
    }

    static void cycleSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] - 1 == i) {
                i++;
            } else {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
        }
    } 
}