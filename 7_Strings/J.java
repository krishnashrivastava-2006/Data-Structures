// Palindrome checking
class J {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abcd"));
        System.out.println(isPalindrome("naman"));
        System.out.println(isPalindrome("Naman"));
        System.out.println(isPalindrome("123454321"));
    }

    static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int start = 0;
        int end = str.length() - 1;

        while (start <= end) {
            if(str.charAt(start) == str.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }

        return true;
    }
}