package VarunExtras.T1_Basics;

import java.util.Arrays;

public class Prog14_ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arr));
        reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr, int i, int j) {
        if(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            reverse(arr,i+1,j-1);
        }
    }
}
