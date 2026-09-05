//852. Finding peak index in mountain array(Bitonic Array)

class H {
    public static void main(String[] args) {
        // int[] x = {0,1,0};
        int[] x = {1,2,3,5,6,4,3,2};

        System.out.println(peakIndex(x));
    }

    static int peakIndex(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while(start != end) {
            int mid = start + ( end - start)/2;

            if(nums[mid] > nums[mid + 1]){
                //you are in decresing part
                //it may be possible that mid is the result
                //but there can be more element greater than mid in left
                //so search in left, hence
                end = mid;
            }else {
                //you are in increasing part of array
                //it may be possible that mid + 1 is the result
                //but it can also be possible that there are more elements greater than
                //one at mid + 1 . so search in right side
                start = mid + 1;
            }
            //At last both start and end will point to the peak elemenet
        }

        return start;
    }
}