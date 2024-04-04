package Day_3.Bhavuk;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 5,1,2};
        List<Integer> list = new Solution().findDuplicates(nums);
        for(Integer i : list){
            System.out.println(i);
        }
    }


}

//**************** USED SWAP SORT METHOD *************************** */
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int indx = 0;
        int n = nums.length;
        while(indx<n){
            if(nums[indx]!=indx+1){
                if(nums[indx]!=nums[nums[indx]-1]){
                    swap(nums,indx,nums[indx]-1);
                }else{
                    indx++;
                }
            }else{
                indx++;
            }
        }
        for(int i = 0; i<n; i++){
            if(nums[i]!=i+1){
                list.add(nums[i]);
            }
        }
        return list;
    }
    public static void swap(int[]arr , int a, int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}