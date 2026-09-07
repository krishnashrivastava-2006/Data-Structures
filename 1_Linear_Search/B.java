//searching in String
class B {
    static boolean search1(String str, char target) {
        if(str.length() == 0)
            return false;
        for(int i = 0; i < str.length(); i++)
            if(str.charAt(i) == target)
                return true;
        
        return false;
    }

    static boolean search2(String str, char target) {
        if(str.length() == 0)
            return false;
        
        for(char next : str.toCharArray()) 
            if(next == target)
                return true;
        return false;
    }

    public static void main(String[] args) {
        String s1 = "Krishna";
        char target = 'i';
        System.out.println(search1(s1,target));
        System.out.println(search1(s1,'l'));
        System.out.println("-----------------");
        System.out.println(search2(s1,'K'));
        System.out.println(search2(s1,'2'));
    }
}