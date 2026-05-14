package BasicMaths;

public class GCDof_2Numbers {
    public static void main(String[] args) {
        int r = GCD(12, 16);
        System.out.println(r);
    }
    static int GCD(int n1, int n2){
        while (n2 != 0) {

            int rem = n1 % n2;

            n1 = n2;
            n2 = rem;
        }

        return n1;
    }
}
