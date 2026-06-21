package Arrays.Easy;
import java.util.Arrays;

public class q06_leftRotateBy_K_places {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6};
        int k = 2;
        leftRotateBy_K(nums, k);
        System.out.println(Arrays.toString(nums));

    }

    static void leftRotateBy_K(int[] nums, int k){
        int n = nums.length;
        k=k%n;
        rotate(nums, 0, k-1);
        rotate(nums, k, nums.length-1);
        rotate(nums, 0, nums.length-1);
    }

    static void rotate(int[] nums, int l, int r){
        while(l<r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
}
