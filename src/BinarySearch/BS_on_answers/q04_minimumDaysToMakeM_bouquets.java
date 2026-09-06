package BinarySearch.BS_on_answers;

public class q04_minimumDaysToMakeM_bouquets {
    public static void main(String[] args) {
        int[] nums = {1, 10, 3, 10, 2};
        System.out.println(minDays(nums, 3, 1));
    }
    public static int minDays(int[] bloomDay, int m, int k) {
        if((long) m*k>bloomDay.length){
            return -1;
        }
        int l =0;
        int h = findMax(bloomDay);
        while(l<h){
            int mid = l+(h-l)/2;
            if(canMake(bloomDay, m, k, mid)){
                h = mid;
            }else{
                l=mid+1;
            }
        }
        return l;
    }

    static boolean canMake(int[] bloomDay, int m, int k, int days){
        int bou =0;
        int cons= 0;

        for(int day : bloomDay){
            if(day<=days){
                cons++;
                if(cons==k){
                    bou++;
                    cons=0;
                    if(bou==m){
                        return true;
                    }
                }
            }else{
                cons=0;
            }
        }
        return false;
    }

    static int findMax(int[] nums){
        int max = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
    }
}
