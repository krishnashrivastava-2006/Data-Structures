//Floor of a number

class D {
    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            mid = start + (end - start)/2;

            if (arr[mid] == target)
                return arr[mid];
            if (isAsc)
                if (arr[mid] > target)
                    end = mid - 1;
                else
                    start = mid + 1;
            else
                if (arr[mid] < target)
                    end = mid - 1;
                else
                    start = mid + 1;
        }

        return arr[end];
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 4, 9, 14, 16, 18};

        System.out.println(floor(a, 15));
        System.out.println(floor(a, 16));
        System.out.println(floor(a, 5));
        System.out.println(floor(a, 20));
    }
}