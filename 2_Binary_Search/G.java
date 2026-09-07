//Finding an element in array if the size of array is infinity means we cannot use .length property

class G {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,7,8,10,11,12,15,20,23,30};
        int target = 15;
        System.out.println("Answer = " + search(arr,target));
    }

    static int search(int[] arr, int target) {
        int start = 0; 
        int end = 1;

        while(arr[end] < target){
            // int temp = end;
            start = end + 1;
            end = start + 1;
        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr, int target, int start, int end) {
        // int start = 0;
        // int end = arr.length - 1;
        int mid;
        
        while(start <= end) {
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