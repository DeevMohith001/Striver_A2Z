package Arrays.Easy;

public class q10_findMissingNumber {
    public static void main(String[] args) {
        int[]  nums = {0, 2, 3, 1, 4};
        int ans = findMissingNumber(nums);
        System.out.println(ans);
    }

    static int findMissingNumber(int[] nums){
        int sum = 0;

        // Sum of elements present in the array
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        int n = nums.length;

        // Expected sum from 0 to n
        int expected = (n * (n + 1)) / 2;

        return expected - sum;

    }
}
