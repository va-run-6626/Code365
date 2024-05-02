package VarunExtras.T3_Arrays;
import java.util.Arrays;

public class Prog49_RearrangeTheArray {
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(arr));
        arr = rearrange(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] rearrange(int[] nums) {
        int pos = 0;
        int neg = 1;
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                ans[pos] = nums[i];
                pos += 2;
            }else{
                ans[neg] = nums[i];
                neg += 2;
            }
        }
        return ans;
    }
}
