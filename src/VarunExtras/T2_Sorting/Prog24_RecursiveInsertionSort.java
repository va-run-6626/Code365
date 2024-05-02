package VarunExtras.T2_Sorting;

import java.util.Arrays;

public class Prog24_RecursiveInsertionSort {
    public static void main(String[] args) {
        int[] nums  = {1,5,3,5,6,8,3,5,8};
        System.out.println(Arrays.toString(nums));
        insertion(nums,0,nums.length);
        System.out.println(Arrays.toString(nums));
    }
    private static void insertion(int[] arr, int i , int n){
        if(i == n) return;
        int j = i;
        while(j > 0 && arr[j-1] > arr[j]){
            swap(arr,j,j-1);
            j--;
        }
        insertion(arr,i+1,n);
    }
    private static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
