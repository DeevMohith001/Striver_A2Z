package Arrays.Easy;

public class q12_singleNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4, 3, 1, 3};
        int a = singleNumber(nums);
        System.out.println(a);
    }
    static int singleNumber(int[] nums){
        int xor = 0;

        for (int i = 0; i < nums.length; i++) {
            xor ^= nums[i];
        }

        return xor;
    }


}
