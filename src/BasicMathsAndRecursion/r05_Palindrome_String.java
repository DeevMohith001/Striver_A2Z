package BasicMathsAndRecursion;

public class r05_Palindrome_String {
    public static void main(String[] args) {
        String s = "maddam";
        boolean re = palindrome(s, 0, s.length()-1);
        System.out.println(re);
    }
    static boolean palindrome(String s, int l, int r){
        if (l>=r){
            return true;
        }
        if (s.charAt(l)!=s.charAt(r)){
            return false;
        }
        return palindrome(s, l+1, r-1);
    }
}
