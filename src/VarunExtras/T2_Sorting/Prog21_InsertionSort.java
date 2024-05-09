package VarunExtras.T2_Sorting;

import java.util.Arrays;

public class Prog21_InsertionSort {
    public static void main(String[] args) {
        int[] nums  = {1,5,3,5,6,8,3,5,8};
        System.out.println(Arrays.toString(nums));
        sort(nums,nums.length);
        System.out.println(Arrays.toString(nums));
    }

    private static void sort(int[] arr, int size) {
        for(int i=1;i<size;i++){
            int element=arr[i];
            int j=i-1;
            while(j>=0 && element<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=element;
        }
    }
}
