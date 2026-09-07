//41.First missing positive

class G {
    public static void main(String[] args) {
        int[] nums = {1,2,0};
        System.out.println(firstMissingPositive(nums));
    }
    public static int firstMissingPositive(int[] nums) {
        cycleSort(nums);
        if(nums[0] > 1) {
            return 1;
        }
        int flag = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i + flag)
                return i + 1;
        }
        return nums[nums.length-1] + 1;
    }

    static void cycleSort(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            if (arr[i] > arr.length || arr[i] < 0) {
                i++;
                continue;
            }
            if(arr[i] != arr[arr[i] - 1]) {
                
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