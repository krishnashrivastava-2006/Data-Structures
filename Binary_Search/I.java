//1095. Find in Mountain Array

class I {
    public static void main(String[] args) {
        MountainArray mountainArray = new MountainArray();
        System.out.println(findInMountainArray(3, mountainArray));
    }

    static int findInMountainArray(int target, MountainArray mountainArr)  {
        int res = peakIndex(mountainArr);
        int ans = binarySearch(mountainArr, target,0,res);
        if(ans == -1) 
            ans = binarySearch(mountainArr, target,res,mountainArr.length()-1);
        return ans;
    }

    static int peakIndex(MountainArray arr) {
        int start = 0;
        int end = arr.length() - 1;

        while(start < end) {
            int mid = start + (end - start)/2;

            if(arr.get(mid) > arr.get(mid + 1)) {
                //we are in decreasing part of array
                end = mid;
            } else {
                //we are in increasing part of array
                start = mid + 1;
            }
        }

        return start;
    }

    static int binarySearch(MountainArray arr, int target, int start, int end) {
        boolean isAsc = arr.get(start) < arr.get(end);
        while(start <= end) {
            int mid = start + (end-start)/2;

            if(arr.get(mid) == target) {
                return mid;
            }

            if(isAsc){
                if(arr.get(mid) < target) {
                    start = mid + 1;
                } else{
                    end = mid - 1;
                }
            } else {
                if(arr.get(mid) > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}