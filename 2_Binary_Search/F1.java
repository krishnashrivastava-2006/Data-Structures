import java.util.Arrays;

//Solved in O(logn) Time Complexity
class F1 {
    public static void main(String[] args) {
        int[] arr ={5, 7 , 7, 8 ,8 ,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(arr,target)));
    }

    static int[] searchRange(int[] arr, int target) {
        int[] ans = {-1,-1};

        ans[0] = search(arr,target,true);
        ans[1] = search(arr,target,false);

        return ans;
    }

    static int search(int[] arr, int target, boolean firstIndex) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        int mid = 0;

        while(start <= end) {
            mid = start + (end - start)/2;

            if(arr[mid] == target) {
                ans = mid;
                if(firstIndex) {
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return ans;
    }
}