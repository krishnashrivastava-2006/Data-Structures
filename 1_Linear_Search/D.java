// finding the smallest element

class D {
    //assuming the array passed is non empty
    static int findMin(int[] arr) {
        int min = arr[0];
        for(int i =1; i < arr.length; i++)
            if(min > arr[i])
                min = arr[i];
        return min;
    }

    public static void main(String[] args) {
        int[] nums = {23,93,57,2,14,378,49,22,11};

        System.out.println(findMin(nums));
    }
}