package BinarySearch.BS_on_answers;

public class q01_sqrt {
    public static void main(String[] args) {
        System.out.println(square(37));
    }
    public static int square(int n){
        int l = 1;
        int h = n;
        int ans = 0;
        while (l<=h){
            int m = l+(h-l)/2;
            if ((long) m*m <= n){
                ans = m;
                l = m+1;
            } else {
                h = m-1;
            }
        }
        return ans;
    }

}
