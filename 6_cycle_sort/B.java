//268. Missing Number

import java.util.Arrays;
class B {
    public static void main(String[] args) {
        int[] x = {0,1,3,5,4,6,7,2,9,10};
        System.out.println(Arrays.toString(x));

        System.out.println("The Missing Number is " + findMissingNumber(x));
        System.out.println(Arrays.toString(x));

    }

    static int findMissingNumber(int[] nums) {
        int ans = nums.length;
        cycleSort(nums);
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != i)
                ans =  i;
        }
        return ans;
    }

    static void cycleSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if(arr[i] < arr.length && arr[i] != arr[arr[i]]) {
                swap(arr,i,arr[i]);
            } else {
                i++;
            }
        }
    }
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
}