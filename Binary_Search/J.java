//33. search in rotated sorted array

class J {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 3;
        // System.out.println("Answer = " + pivotElement(nums));
        System.out.println("Answer = " + search(nums,target));
    }

    static int search(int[] arr, int target) {
        int pivotIndex = pivotIndex(arr);
        int ans = binarySearch(arr, target,0, pivotIndex);
        if(ans == -1) {
            ans = binarySearch(arr, target, pivotIndex + 1, arr.length-1);
        }
        return ans;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        // int start = 0;
        // int end = arr.length - 1;
        int mid;
        
        while(start < end) {
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
    

    static int pivotIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + ( end - start )/2;

            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (mid > start && arr[mid -1] > arr[mid]) {
                return mid - 1;
            }
            if(arr[mid] > arr[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}