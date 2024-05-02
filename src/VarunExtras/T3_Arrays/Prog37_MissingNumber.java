package VarunExtras.T3_Arrays;

public class Prog37_MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        int num = missingNumber(arr);
        System.out.println(num);
    }
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n*(n+1))/2;
        for(int i : nums){
            sum -= i;
        }
        return sum;
    }
}
