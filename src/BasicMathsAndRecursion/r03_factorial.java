package BasicMathsAndRecursion;

public class r03_factorial {
    public static void main(String[] args) {
        int r = factorial(6);
        System.out.println(r);
    }
    static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        return n * factorial(n-1);
    }
}
