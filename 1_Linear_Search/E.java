//Search in 2D array
import java.util.Arrays;


class E {

    static int[] searchIn2DArray(int[][] arr, int target) {
        if(arr.length == 0)
            return new int[]{-1,-1};
        for(int row = 0; row < arr.length; row++)
            for(int col = 0; col < arr[row].length; col++)
                if(arr[row][col] == target)
                    return new int[]{row,col};
        return new int[]{-1,-1};
    }

    static int maxIn2DArray(int[][] arr) {
        int max = Integer.MIN_VALUE;

        for(int[] next : arr)
            for(int nxt : next)
                if(nxt > max)
                    max = nxt;
                    
        return max;
    }


    public static void main(String[] args) {
        int[][] x = {
            {23, 4, 1},
            {18, 12, 3, 9},
            {78, 99, 34, 56},
            {18, 12}
        };

        int target = 34;

        System.out.println("Answer-searching : " + Arrays.toString(searchIn2DArray(x, 34)));
        System.out.println("Answer-maximum : " + maxIn2DArray(x));
        
    }
}