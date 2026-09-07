//744.

class E {
    // static char search(char[] arr, char target) {
    //     int start = 0;
    //     int end = arr.length - 1;
    //     int mid = 0;

    //     while(start <= end) {
    //         mid = start + (end - start)/2;

    //         if(arr[mid] == target){
    //             while(arr[mid + 1] == arr[mid]){
    //                 mid++;
    //             }
    //             if((mid + 1) < arr.length) 
    //                 return arr[mid+1];
    //             else
    //                 return arr[0];
    //         }
    //         if (arr[mid] > target) {
    //             end = mid - 1;
    //         } else {
    //             start = mid + 1;
    //         }
    //     } 
    //     return arr[0];      
    // }
    static char search(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        while(start <= end) {
            mid = start + (end - start)/2;

            if(arr[mid] > target)
                end = mid - 1;
            else 
                start = mid + 1;
        }    

        return arr[start % arr.length];
    }
}