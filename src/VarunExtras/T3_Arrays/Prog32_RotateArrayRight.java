package VarunExtras.T3_Arrays;

import java.util.Arrays;

public class Prog32_RotateArrayRight {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        System.out.println(Arrays.toString(arr));
        rotate(arr,k);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums,0,nums.length-1-k);
        reverse(nums,nums.length-k, nums.length-1);
        reverse(nums,0,nums.length-1);
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
