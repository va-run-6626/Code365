package VarunExtras.T3_Arrays;

public class Prog29_SortedAndRotated {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        boolean ans = check(arr);
        System.out.println(ans);
    }
    public static boolean check(int[] nums) {
        int ans = 0;
        if(nums[0] < nums[nums.length-1]){
            ans++;
        }
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] > nums[i+1]){
                ans++;
            }
        }
        return !(ans > 1);
    }
}
