//Binary Search

class A {
    public static void main(String[] args) {
        int[] x = {23, 33, 37, 45, 51, 58, 69, 77, 81, 85, 91 , 91, 91, 100};
        // int target = 69;
        // int target = 91;
        int target = 11;
        System.out.println("Answer = " + binarySearch(x, target));        
    }


    //return index if element is found
    //return -1 if element is not found
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        
        while(start <= end) {
            // mid = (start+end)/2;  
            // //But this can be problem generating
            // if start and end values are too large 
            // i.e.start+end exceeds the range of integer 
            // Hence to avoid this problem the better way to calculate mid is :


            mid = start + (end - start)/2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1; //element not found in the array
    }
}