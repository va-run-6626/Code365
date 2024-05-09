package VarunExtras.T3_Arrays;

import java.util.Arrays;

public class Prog64_MergeTwoSortedArraysUsingExtraSpace {
    public static void main(String[] args) {
        int[] a = {1,2,6,9};
        int[] b = {3,7,8};
        System.out.println(Arrays.toString(a) + " " +Arrays.toString(b));
        sort(a,b);
        System.out.println(Arrays.toString(a) + " " +Arrays.toString(b));
    }

    private static void sort(int[] a, int[] b) {
        int left = a.length-1;
        int right = 0;
        while(left >= 0 && right < b.length){
            if(a[left] >= b[right]){
                swap(a,b,left,right);
                left--;
                right++;
            }else{
                break;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }

    private static void swap(int[] a, int[] b, int left, int right) {
        int temp = a[left];
        a[left] = b[right];
        b[right] = temp;
    }
}
