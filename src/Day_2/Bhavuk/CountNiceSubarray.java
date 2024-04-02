package Day_2.Bhavuk;

public class CountNiceSubarray {
    public static void main(String[] args) {
        int[] nums = {1,1,2,1,1};
        int k = 3;
        int result = new Solution().numberOfSubarrays(nums,k);
        System.out.println(result);

    }

}
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return find(nums,k)-find(nums,k-1);
    }
    int find(int[] arr, int k){
        int n = arr.length;
        int l = 0;
        int co = 0;
        int sc = 0;
        for(int r = 0; r<n; r++){
            if(arr[r]%2!=0){
                co++;
            }
            if(co<=k){
                sc+=r-l+1;
            }
            while(l<=r && co>k){
                if(arr[l]%2!=0){
                    co--;
                }
                l++;
                if(co<=k){
                    sc+=r-l+1;
                }
            }
        }
        return sc;
    }
}