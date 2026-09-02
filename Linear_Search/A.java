//Searching in array of integers

class A {
    public static void main(String[] args) {
        int[] nums = {34,73,95,27,47,78,27,74,63,2,59,30};
        // int[] nums ={};


        // int target = 2;
        // int target = 73;
        int target = 90;

        int ans = linearSearch1(nums, target);

        System.out.println(ans);


        System.out.println("-------------------------------");

        int[] nums2 = {34,765,25,965,25,896,25,86,34,56,77};
        int target1 = 896;
        System.out.println(linearSearch2(nums2,target1));
        System.out.println(linearSearch2(nums2,9));
        
        
        System.out.println("-------------------------------");

        int[] nums3 = {46,74,28,94,38,33,47,44,58,89,97};
        System.out.println(linearSearch3(nums3,94));
        System.out.println(linearSearch3(nums3,99));
    }

    static int linearSearch1(int[] arr, int target) {
        if(arr.length == 0)
            return -1;
        for(int index = 0; index < arr.length; index++) {
            if(arr[index] == target)
                return index;
        }

        return -1;
    }

    static int linearSearch2(int[] arr, int target) {
        if(arr.length == 0)
            return Integer.MIN_VALUE;
        
        for(int next : arr)
            if(next == target)
                return next;

        return Integer.MIN_VALUE;
    }

    static boolean linearSearch3(int[] arr, int target) {
        if(arr.length == 0)
            return false;
        
        for(int next : arr)
            if(next == target)
                return true;
        
        return false;
    }
}