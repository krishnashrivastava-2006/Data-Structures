class A {
    public static void main(String[] args) {
        pattern(10);
    }

    static void pattern(int n) {
        for (int row = 1; row < n + 1; row++) {
            //for every row, run the column
            for (int col = 1; col <= row; col++) {
                //what do you need to print
                System.out.print("* ");
            }//when one row is printed we need to add a new line
            System.out.println();
        }
    }
}