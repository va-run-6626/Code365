package VarunExtras.T2_Sorting;

import java.util.Arrays;

public class Prog23_RecursiveBubbleSort {
    public static void main(String[] args) {
        int[] nums  = {1,5,3,5,6,8,3,5,8};
        System.out.println(Arrays.toString(nums));
        bubbleSort(nums,nums.length);
        System.out.println(Arrays.toString(nums));
    }
    public static void bubbleSort(int[] arr, int n) {
        if (n == 1) return;
        for (int j = 0; j <= n - 2; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        bubbleSort(arr, n - 1);
    }
}
