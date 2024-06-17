package Day_60.Varun;

public class CountTripletsThatCanFormTwoArraysOfEqualXOR {
    public static void main(String[] args) {
        int[] arr = {2,3,1,6,7};
        int ans = new Solution().cntTriplets(arr);
        System.out.println(ans);
    }
}
class Solution{
    public int cntTriplets(int[] arr){
        int n = arr.length;
        int[] pre = new int[n+1];
        for(int i = 0; i < n; i++){
            pre[i+1] = pre[i] ^ arr[i];
        }
        int ans = 0;
        for(int i = 0; i < n; i++){
            for(int k = i+1; k < n; k++){
                if(pre[i] == pre[k+1]){
                    ans += (k - i);
                }
            }
        }
        return ans;
    }
}
