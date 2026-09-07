//287. Find the Duplicate Number

class D {
    public static void main(String[] args) {
        int[] x = {1,3,4,2,2};
        System.out.println("Duplicate Element is : " + findDuplicate(x));
    }

    static int findDuplicate(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            if (nums[i] != i + 1) {
                if(nums[i] == nums[nums[i] - 1])
                    return nums[i];
                swap(nums,i,nums[i]-1);
                
            } else {
                i++;
            }
        }
        return nums.length;
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}