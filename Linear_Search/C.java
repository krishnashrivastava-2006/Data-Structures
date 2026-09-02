//search in a range

class C {
    static int linearSearch(int[] arr, int target, int start, int end) {
        if(arr.length == 0)
            return -1;

        for(int i = start; i <= end; i++)
            if(arr[i] == target)
                return i;
        
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {12,73,28,93,83,79,35,37,56,74,11,29};

        System.out.println(linearSearch(nums, 83, 3, 8));
        System.out.println(linearSearch(nums, 73, 3, 8));

    }
}