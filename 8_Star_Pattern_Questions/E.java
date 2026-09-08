class E {
    public static void main(String[] args) {
        pattern5(10);
    }

    static void pattern5(int n) {
        for (int row = 1; row < 2 * n; row++) {
            if(row <= n) {
                for(int col = 1; col <= row; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            } else {
                for(int col = 1; col < (2*n - row + 1); col++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

        }
    }
}