class J {
    public static void main(String[] args) {
        pattern10(5);
    }
    static void pattern10(int n) {
        for(int i = 1; i < n*2; i++) {
            int totalColInRow = (i <= n)?i:n*2-i; 

            for(int space = 0; space < n-totalColInRow; space++)
                System.out.print(" ");

            for(int j = totalColInRow; j > 0; j--)
                System.out.print(j);
            for(int j = 2; j <= totalColInRow; j++)
                System.out.print(j);

            // for(int space = 0; space < n-i; space++)
            //     System.out.print(" ");

            System.out.println();
        }
    }
}