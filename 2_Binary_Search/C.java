// ceiling of a number

class C {
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 9, 14, 16, 18};

        System.out.println(ceiling(a, 14));
        System.out.println(ceiling(a, 15));
        System.out.println(ceiling(a, 6));
        System.out.println(ceiling(a, 1));
    }

    static int ceiling(int[] arr, int target) {
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

        return isAsc?arr[(start+1)]:arr[(start-1)];
    }
}