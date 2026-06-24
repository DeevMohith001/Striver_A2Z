package Arrays.Easy;
import java.util.ArrayList;
public class q09_unionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 7};
//        ArrayList<Integer>() a = union(nums1, nums2);
    }
    static ArrayList<Integer> union(int[] nums1, int[] nums2){

        int i = 0, j = 0;

        ArrayList<Integer> ans = new ArrayList<>();

        while(i < nums1.length && j < nums2.length){

            if(nums1[i] < nums2[j]){

                if(ans.size() == 0 || ans.get(ans.size()-1) != nums1[i])
                    ans.add(nums1[i]);

                i++;
            }

            else if(nums2[j] < nums1[i]){

                if(ans.size() == 0 || ans.get(ans.size()-1) != nums2[j])
                    ans.add(nums2[j]);

                j++;
            }

            else{

                if(ans.size() == 0 || ans.get(ans.size()-1) != nums1[i])
                    ans.add(nums1[i]);

                i++;
                j++;
            }
        }

        while(i < nums1.length){

            if(ans.size() == 0 || ans.get(ans.size()-1) != nums1[i])
                ans.add(nums1[i]);

            i++;
        }

        while(j < nums2.length){

            if(ans.size() == 0 || ans.get(ans.size()-1) != nums2[j])
                ans.add(nums2[j]);

            j++;
        }

        return ans;
    }
}
