package BasicMaths;

public class ReverseNumber {
    public static void main(String[] args) {
        int r = reverse(4376);
        System.out.println(r);
    }
    static int reverse(int n){
        int rev = 0;

        while (n != 0) {

            int digit = n % 10;   // extract last digit

            rev = rev * 10 + digit; // build reversed number

            n = n / 10; // remove last digit
        }

        return rev;
    }
}
