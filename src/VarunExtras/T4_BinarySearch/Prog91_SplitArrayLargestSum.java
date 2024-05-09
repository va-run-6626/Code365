package VarunExtras.T4_BinarySearch;

public class Prog91_SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;
        int ans = largestSubarraySumMinimized(arr,k);
        System.out.println(ans);
    }
    public static int largestSubarraySumMinimized(int []a, int k) {
        int s = 0;
        int e = 0;
        for(int i : a){
            s = Math.max(s, i);
            e += i;
        }
        while(s <= e){
            int mid = s + (e - s)/2;
            int pieces = calPieces(a,mid);
            if(pieces > k){
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
        return s;
    }
    public static int calPieces(int[] arr, int s){
        int sum = 0;
        int pieces = 0;
        for(int i = 0; i < arr.length; i++){
            if(sum + arr[i] <= s){
                sum += arr[i];
            }else{
                pieces++;
                sum = arr[i];
            }
        }
        pieces++;
        return pieces;
    }
}
