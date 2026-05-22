package Arrays.Easy;

public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = {34, 57, 12, -90, 24, 68};
        int r = largest(arr);
        System.out.println(r);
    }
    static int largest(int[] nums){
        int large = nums[0];
        for (int i = 0; i < nums.length-1; i++) {
            if (large<nums[i+1]){
                large = nums[i+1];
            }
        }
        return large;
    }
}
