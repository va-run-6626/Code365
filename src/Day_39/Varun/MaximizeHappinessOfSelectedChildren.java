package Day_39.Varun;
import java.util.Arrays;
public class MaximizeHappinessOfSelectedChildren {
    public static void main(String[] args) {
        int[] happiness = {2,3,4,5};
        int k = 2;
        long ans = new Solution().maximumHappinessSum(happiness,k);
        System.out.println(ans);
    }
}
class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long ans = 0;
        int idx = happiness.length-1;
        for(int i = 0; i < k; i++){
            if(happiness[idx] - i > 0){
                ans += happiness[idx] - i;
                idx--;
            }else{
                break;
            }
        }
        return ans;
    }
}
