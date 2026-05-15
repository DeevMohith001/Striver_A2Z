package BasicMathsAndRecursion;

public class CountDigits {
    public static void main(String[] args) {
        int result = countDigits(123098);
        System.out.println(result);

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
