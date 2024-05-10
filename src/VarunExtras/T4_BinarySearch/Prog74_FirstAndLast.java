package VarunExtras.T4_BinarySearch;

import java.util.Arrays;

public class Prog74_FirstAndLast {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,4,4,5,6,7};
        int target = 4;
        System.out.println(Arrays.toString(solve(arr,arr.length,target)));
    }

    private static int[] solve(int[] arr, int n, int target) {
        int startIdx = bs(arr,n,target,true);
        int endIdx = bs(arr,n,target,false);
        return new int[]{startIdx,endIdx};
    }

    private static int bs(int[] arr, int n, int target, boolean isFirst) {
        int s = 0;
        int e = n-1;
        int potAns = -1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == target){
                potAns = mid;
                if(isFirst){
                    e = mid-1;
                }else{
                    s = mid+1;
                }
            }else if(arr[mid] > target){
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        return potAns;
    }
}