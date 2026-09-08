class L {
    public static void main(String[] args) {
        pattern11(4);
    }

    static void pattern11(int n) {
        int temp = n;
        n = n*2;
        for(int row = 0; row <= n; row++) {
            for(int col = 0; col <= n; col++) {
                int ans = temp - Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(ans + " ");
            }
            System.out.println();
        }
    }
}