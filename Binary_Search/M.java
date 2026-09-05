class M {
    public static int splitArray(int[] nums, int k) {
        int start = minAns(nums);
        // System.out.println(start);
        int end = maxAns(nums);
        // System.out.println(end);
        int mid = 0;

        if(start == 0 && end == 0) {
            return 0;
        }

        while(start != end) {
            mid = start + (end - start)/2;
            // System.out.println(mid + "------");
            // System.out.println(pieces(nums,mid));

            if(pieces(nums,mid) <= k) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        // System.out.println("------------");
        // System.out.println(start);
        // System.out.println(mid);
        // System.out.println(end);
        return start;
    }
    public static void main(String[] srg) {
        int[] nums = {0,0};
        int k = 1;
        System.out.println(splitArray(nums,k));
    }

    static int maxAns(int[] nums) {
        int sum = 0;
        for (int next : nums) {
            sum += next;
        }
        // System.out.println(sum + "-----");
        return sum;
    }
    static int minAns(int[] nums) {
        int maxEle = 0;
        for (int next : nums) {
            if(next > maxEle)
                maxEle = next;
        }
        // System.out.println(maxEle + "-----");
        return maxEle;
    }

    static int pieces(int[] arr, int m) {
        int count = 1;
        int i = 0;
        int sum = 0;
        
        for(int next : arr) {
            if(next + sum > m) {
                sum = next;
                count++;
            } else {
                sum += next;
            }
        }
        // System.out.println(count);
        
        return count;
    }

}