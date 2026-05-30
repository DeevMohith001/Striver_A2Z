package Arrays.Easy;

public class SortedArray {
    public static void main(String[] args) {
//        int[] arr = {34, 57, 126, -90, 24, 68, 65};
        int[] arr = {2, 22, 23,45, 76};
        boolean r = isSorted(arr);
        System.out.println(r);
    }
    static boolean isSorted(int[] nums){
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] > nums[i+1]){
                return false;
            }
        }
        return true;
    }
}
