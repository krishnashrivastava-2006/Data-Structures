class I {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            sb.append(ch);
        }

        System.out.println(sb);
    }
}

//In this at each step no new object is created as StringBuilder is mutable
//the same object is modified at each step resulting in better performance and 
//better memory utilization
//hence problems where the string value is repeated again and again use StringBuilder data typw