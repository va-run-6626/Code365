package VarunExtras.T3_Arrays;

public class Prog28_isSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        boolean isSorted = isSorted(arr.length,arr) == 1 ? true : false;
        System.out.println(isSorted);
    }
    public static int isSorted(int n, int []a) {
        if(a.length == 1) return 1;
        for(int i = 0; i < n-1; i++){
            if(a[i] > a[i+1]) return 0;
        }
        return 1;
    }
}
