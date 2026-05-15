package BasicMathsAndRecursion;

public class r02_sumOf_N_numbers {
    public static void main(String[] args) {
        int r = NnumbersSum(10);
        System.out.println(r);
    }
    static int NnumbersSum(int n){
        if (n==0){
            return 0;
        }
        return n + NnumbersSum(n-1);
    }
}
