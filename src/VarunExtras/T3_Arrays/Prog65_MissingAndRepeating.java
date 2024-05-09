package VarunExtras.T3_Arrays;

import java.util.Arrays;

public class Prog65_MissingAndRepeating {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2};
        System.out.println(Arrays.toString(solve(arr)));
    }

    private static int[] solve(int[] a) {
        int i = 0;
        while(i < a.length){
            int correct = a[i] - 1;
            if(correct >= 0 && a[i] != a[correct]){
                swap(a,i,correct);
            }else{
                i++;
            }
        }
        for(i = 0; i < a.length; i++){
            if(a[i] != i+1){
                return new int[]{a[i],i+1};
            }
        }
        return new int[]{-1,-1};
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
