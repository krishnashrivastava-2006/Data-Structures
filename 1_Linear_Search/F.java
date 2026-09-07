//1295. Find Numbers with Even Number of Digits

class F {
    public static void main(String[] args) {
        // int[] nums = {12,345,2,6,7896};
        int[] nums = {555,901,482,1771};
        int ans = findNumber(nums);
        System.out.println("Answer : " + ans);
    }

    static int findNumber(int[] arr) {
        int count = 0;
        if(arr.length == 0)
            count++;
        
        for(int next : arr)
            if(isEven(next))
                count++;

        return count;
    }

    static boolean isEven(int num) {
        int count = 0;
        while(num > 0) {
            count++;
            num /= 10;
        }
        return count%2 == 0;
    }


}