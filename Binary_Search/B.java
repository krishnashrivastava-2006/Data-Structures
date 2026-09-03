// Order Agnostic Binary search
//what if we dont know whether the array is sorted in ascending order or descending order

class B {
    public static void main(String[] args) {
        int[] ascArr = {11, 14, 23, 27, 33, 33, 41, 45, 56, 92, 101};

        int[] dscArr = {110, 100, 99, 91, 82, 81, 77, 71, 69, 60, 55, 51, 42, 33, 1, -20};


        System.out.println("Asc Answer = " + orderAgnosticBinarySearch(ascArr, 41)); 
        System.out.println("Dsc Answer = " + orderAgnosticBinarySearch(dscArr, 82)); 
    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            mid = start + (end - start)/2;

            if (arr[mid] == target)
                return mid;

            if (isAsc) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] > target)
                    start = mid + 1;
                else  
                    end = mid + 1;
            }
        }

        return -1;
    }
}