class H {
    public static void main(String[] args) {
        pattern8(5);
    }
    static void pattern8(int n) {
        for(int row = 1; row <= n*2; row++) {
            int totalColInRow = (row <= n)?row:n*2-row;
            int totalSpaces = n - totalColInRow;

            for(int col = 1; col <= totalSpaces; col++) {
                System.out.print(" ");
            }
            for(int col = 1; col <= totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

} 