package Arrays.Easy;

public class q05_leftRotateByOne {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        rotateArrayByOne(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    static void rotateArrayByOne(int[] nums) {
        int first = nums[0];

        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }

        nums[nums.length - 1] = first;
    }
}
