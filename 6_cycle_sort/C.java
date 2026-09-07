//448. find all numbers disappeared in an array
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


class C {

    public static void main(String[] arrgs) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List list = findDisappearedNumbers(arr);

        System.out.println(list);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        cycleSort(nums);
        // System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i] - 1) {
                list.add(i + 1);
            }
        }

        return list;

    }
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void cycleSort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] <= nums.length && nums[i] - 1 != i) { // <= thought by myself
                if(nums[i] == nums[nums[i] - 1]) { // thought by myself
                    i++;
                    continue;
                }
                swap(nums, i, nums[i] - 1);
            } else {
            // System.out.println("j");
                i++;
            }
        }
    }
}