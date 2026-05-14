package BasicMaths;

public class ArmstrongNumber {
    public static void main(String[] args) {
        boolean r = armStrong(1530);
        System.out.println(r);
    }
    static boolean armStrong(int n){
        if (n==0){
            return true;
        }
        int digits = countDigits(n);
        int original = n;
        int sum = 0;
        while (n!=0){
            int digit = n % 10;

            sum += Math.pow(digit, digits);

            n = n / 10;
        }
        return sum == original;
    }

    static int countDigits(int n){
        if (n==0){
            return 1;
        }

        int count = 0;
        while (n!=0){
            n=n/10;
            count++;
        }
        return count;
    }
}
