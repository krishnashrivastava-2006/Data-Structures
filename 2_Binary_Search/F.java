// 34.

//It is correct but beause of time complexity it failed
import java.util.Arrays;

class F {
    public static void main(String[] args) {
        int[] arr ={5, 7 , 7, 8 ,8 ,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(arr,target)));
    }

    static int[] searchRange(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while(start <= end) {
            mid = start + (end - start)/2;

            if(arr[mid] == target) {
                if(arr[mid-1] != arr[mid] && arr[mid+1] != arr[mid]) {
                    return new int[]{mid, mid};
                }
                int firstPosition = findFirstPosition(arr,mid);
                int lastPosition = findLastPosition(arr,mid);
                return new int[]{firstPosition,lastPosition};
            }else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return new int[]{-1,-1};
    }
    static int findFirstPosition(int[] a, int m) {
        while(a[m-1]==a[m]){
            m--;
        }
        return m;
    }
    static int findLastPosition(int[] a, int m) {
        while(a[m+1]==a[m]){
            m++;
        }
        return m;
    }
}