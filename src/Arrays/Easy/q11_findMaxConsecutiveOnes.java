package Arrays.Easy;

public class q11_findMaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0};
        int ans = findMaxConsecutiveOnes(nums);
        System.out.println(ans);
    }
    static int findMaxConsecutiveOnes(int[] nums){
        int c = 0;
        int mc = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1){
                c += 1;
                mc = max(mc, c);
            } else {
                c = 0;
            }
        }
        return mc;
    }
    static int max(int a, int b){
        if (a>b){
            return a;
        }
        return b;
    }
}
