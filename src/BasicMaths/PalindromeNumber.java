package BasicMaths;

public class PalindromeNumber {
    public static void main(String[] args) {
        boolean r = IsPalindrome(8778);
        System.out.println(r);
    }

    static boolean IsPalindrome(int n){
        if (n==reverse(n)){
            return true;
        }
        return false;
    }
    static int reverse(int n){
        int rev = 0;
        while (n!=0){
            int digit = n%10;
            rev = rev*10+digit;
            n=n/10;
        }
        return rev;
    }
}
