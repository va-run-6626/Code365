package VarunExtras.T3_Arrays;

import java.util.Arrays;

public class Prog31_LeftRotateArrayByOne {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(arr));
        arr = rotateArray(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static int[] rotateArray(int[] arr, int n) {
        reverse(arr, 1,n-1);
        reverse(arr, 0,n-1);
        return arr;
    }
    static void reverse(int[] arr, int i, int j){
        while(i <= j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
