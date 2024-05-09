package VarunExtras.T3_Arrays;

public class Prog68_MaximumProductSubarray {
    public static void main(String[] args) {
        int[] arr = {-2, 3, -4, 0};
        System.out.println(maximumProductSubarray(arr));
    }

    private static int maximumProductSubarray(int[] arr) {
        int n = arr.length;
        int pre = 1;
        int suff = 1;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(pre == 0) pre =1;
            if(suff == 0) suff =1;
            pre *= arr[i];
            suff *= arr[n-i-1];
            max = Math.max(max,Math.max(pre,suff));
        }
        return max;
    }
}
