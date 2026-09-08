//String performance

class H {
    public static void main(String[] args) {
        String series = "";

        for(int i = 0; i < 26; i++) {
            char character = (char)('a' + i);
            series += character;
        }

        System.out.println(series);
    }
}

//But since String datatype is immutable so at each step a new object is created
//because of this more memory utilization happens 
//and the complexity is O(n^2) which is bad
// so to overcome this problem another type exits named StringBuilder