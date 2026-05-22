package BasicMathsAndRecursion;

public class r06_fibonacci {
    public static void main(String[] args) {
        int r = fibo(6);
        System.out.println(r);
    }

    static int fibo(int n){
        if (n==0 || n==1){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
