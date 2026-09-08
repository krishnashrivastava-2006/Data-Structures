class B {
    public static void main(String[] args) {
        pattern2(5);
    }

    static void pattern2(int n) {
        //run the outer loop for no of rows or lines
        for(int row = 1; row <= n; row++) {
            //for each row run the inner loop
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}