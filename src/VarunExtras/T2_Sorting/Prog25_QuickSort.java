package VarunExtras.T2_Sorting;

import java.util.Arrays;

public class Prog25_QuickSort {
    public static void main(String[] args) {
        int[] nums = {1, 5, 3, 5, 6, 8, 3, 5, 8};
        System.out.println(Arrays.toString(nums));
        quickSort(nums,0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    public static void quickSort(int[] input,int low ,int high) {
        if(low >= high){
            return;
        }

        int start = low;
        int end = high;

        int mid = start + (end - start)/2;
        int pivot = input[mid];
        while(start <= end){
            while(input[start] < pivot) start++;
            while(input[end] > pivot) end--;

            if(start <= end){
                int temp = input[start];
                input[start] = input[end];
                input[end] = temp;
                start++;
                end--;
            }
        }
        quickSort(input, low,end);
        quickSort(input, start, high);
    }
}
