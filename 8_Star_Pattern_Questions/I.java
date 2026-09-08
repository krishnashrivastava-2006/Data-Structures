class I {
    public static void main(String[] args) {
        pattern9(5);
    }
    static void pattern9(int n) {
        for(int i = 1; i <= n; i++) {
            for(int space = 1; space <= n-i; space++) 
                System.out.print(" ");
            
            for(int j = i; j > 0; j--) 
                System.out.print("$");

            for(int j = 2; j < i + 1; j++) 
                System.out.print("$");

            for(int space = 1; space < n; space++) 
                System.out.print(" ");
        System.out.println();
        }
    }
}