package VarunExtras.T2_Sorting;

import java.util.*;

public class Prog22_MergeSort {
    public static void main(String[] args) {
        int[] nums  = {1,5,3,5,6,8,3,5,8};
        System.out.println(Arrays.toString(nums));
        sort(nums,0,nums.length);
        System.out.println(Arrays.toString(nums));
    }

    private static void sort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2 ;
        sort(arr, low, mid);
        sort(arr, mid + 1, high); // right half
        merge(arr, low, mid, high);
    }
    private static void merge(int[] arr, int l, int m , int h){
        ArrayList<Integer> list = new ArrayList<>();
        int left = l;
        int right = m+1;

        while(left <= m && right <= h){
            if(arr[left] <= arr[right]){
                list.add(arr[left]);
                left++;
            }else{
                list.add(arr[right]);
                right++;
            }
        }

        while(left <= m){
            list.add(arr[left]);
            left++;
        }
        while(right <= h){
            list.add(arr[right]);
            right++;
        }

        for(int i = l; i <= h; i++){
            arr[i] = list.get(i-l);
        }
    }
}
