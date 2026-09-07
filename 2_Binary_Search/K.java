class K {
    public static void main(String[] args) {
        int[] x = {2,9,2,2,2,2,2};
        int target = 10;
        System.out.println("Answer = " + search(x,2));
    }

    static int search(int[] nums, int target) {
        int pivot = findPivotWithDuplicates(nums);

        if(nums[pivot] == target) {
            return pivot;
        }
        if(nums[0] < target) {
            return binarySearch(nums,target,0,pivot-1);
        } else {
            // return
            return binarySearch(nums,target,pivot+1, nums.length-1);
        }
        // return -1;
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

static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}