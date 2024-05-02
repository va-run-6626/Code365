package VarunExtras.T4_BinarySearch;

public class Prog88_KthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] arr = {2,4,5,7};
        int k = 3;
        System.out.println(missingK(arr,arr.length,k));
    }

    private static int missingK(int[] arr, int n, int k) {
        int s = 0;
        int e = n-1;
        while(s <= e){
            int m = s + (e - s)/2;
            if(arr[m] - m-1 < k)
                s = m +1;
            else
                e = m -1;
        }
        return s + k;
    }
}
