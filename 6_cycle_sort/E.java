//442. Find all Duplicate Elements in Array
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



class E {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};

        System.out.println("Answer : " + findDuplicates(nums));
        System.out.println(Arrays.toString(nums));

    }

    static public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        cycleSort(nums);
        for(int i = 0; i < nums.length; i++) 
            if (nums[i] != i + 1)
                list.add(nums[i]);
        return list;
    }

    static void cycleSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                if (arr[i] == arr[arr[i] - 1]) {
                    i++;
                    continue;
                }
                swap(arr, i, arr[i] - 1);
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