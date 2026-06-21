package Arrays.Easy;

public class q02_SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {34, 57, 126, -90, 24, 68, 65};
        int r = secondLargestElement(arr);
        System.out.println(r);
    }

    static int secondLargestElement(int[] nums){
        int largest = nums[0];
        int secLargest = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>largest){
                secLargest = largest;
                largest = nums[i];
            }
            else if (nums[i]>secLargest && nums[i]<largest){
                secLargest = nums[i];
            }
        }
        return secLargest;
    }
}
