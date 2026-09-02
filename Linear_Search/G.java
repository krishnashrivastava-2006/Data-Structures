// 1672. Richest Customer Wealth

class G {
    public static void main(String[] args) {
        int[][] num = {
            {2,8,7},
            {7,1,3},
            {1,9,5}
        };

        System.out.println(maximumWealth(num));

    }

    static int maximumWealth(int[][] arr) {
        int max = 0;
        int sum = 0;

        for(int[] next : arr) {
            for(int nxt : next) {
                sum += nxt;
            }
            // System.out.println(sum);
            if(max < sum) {
                max = sum;
            }
            sum = 0;
        }


        return max;
    }
}