//Insertion sort

import java.util.Arrays;

class A {
    public static void main(String[] args) {
        int[] x = {2,5,7,4,67,8,4,3,2,2,2,6,7,0,4,2};
        System.out.println(Arrays.toString(x));

        insertionSort(x);

        System.out.println(Arrays.toString(x));
    }

    static void insertionSort(int[] arr) {
        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = i + 1; j > 0; j--) {
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else {
                    break;
                }

            }
        }
    }   
}