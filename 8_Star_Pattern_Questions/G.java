class G {
    public static void main(String[] args) {
        pattern7(5);
    }

    public static void pattern7(int n) {
        for(int row = n; row > 0; row--) {
            for(int col = n; col > 0; col--) {
                if(col > row) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}