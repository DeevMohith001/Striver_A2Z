package Arrays.Easy;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] arr = {34, 57, 126, -90, 24, 68, 65};
        int r = remove(arr);
        System.out.println(r);
    }

    static int remove(int[] nums){
        if (nums.length == 0) {
            return 0;
        }

        int count = 0;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[count]) {
                count++;
                nums[count] = nums[i];
            }
        }

        return count + 1;
    }
}
