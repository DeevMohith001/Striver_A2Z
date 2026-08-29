package Arrays.Medium;
import java.util.Arrays;
public class q02_SortColors_akaDutchFlagProblem {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};

//        sortColors(nums);
        dutchFlag(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sortColors(int[] nums) {
        int c0 = 0;
        int c1 = 0;
        int c2 = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                c0 += 1;
            } else if(nums[i]==1){
                c1 += 1;
            } else{
                c2 += 1;
            }
        }
        int index = 0;
        while(c0>0){
            nums[index] = 0;
            index++;
            c0--;
        }
        while(c1>0){
            nums[index] = 1;
            index++;
            c1--;
        }
        while(c2>0){
            nums[index] = 2;
            index++;
            c2--;
        }
    }

    public static void dutchFlag(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {

                // Put 0 on the left
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;

            }
            else if (nums[mid] == 1) {

                // 1 is already in the correct middle region
                mid++;

            }
            else {

                // Put 2 on the right
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;

                // Don't increment mid
            }
        }
    }
}
