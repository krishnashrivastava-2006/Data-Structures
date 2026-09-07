//645. Set mismatch
import java.util.Arrays;
class F {

    public static void main(String[] args) {
        int[] x = {3,2,2};

        System.out.println(Arrays.toString(findErrorNums(x)));

    }

    public static  int[] findErrorNums(int[] nums) {
        cycleSort(nums);   //don't forget to call this method again and again as im forgetting each time lol
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != i + 1) {
                return new int[]{nums[i], i+1};
            }
        }
        return new int[]{nums.length+1,nums.length+1};
    }

    static void cycleSort(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            if(arr[i] != i + 1) {
                if(arr[i] == arr[arr[i]-1]) {
                    i++;
                    continue;
                }
                swap(arr,i,arr[i]-1);
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