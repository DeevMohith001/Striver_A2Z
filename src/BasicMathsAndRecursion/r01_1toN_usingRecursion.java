package BasicMathsAndRecursion;

public class r01_1toN_usingRecursion {
    public static void main(String[] args) {
        printNumbers(10);
    }
    static void printNumbers(int n){
        if (n==0){
            return;
        }
        printNumbers(n-1);
        System.out.print(n + " ");
    }
}
