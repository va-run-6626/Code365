package VarunExtras.T3_Arrays;

public class Prog26_LargestElement {
    public static void main(String[] args) {
        int[] arr = {1,4,2,6,8,56,4,6,8,5};
        int largest = largestElement(arr,arr.length);
        System.out.println(largest);
    }
    static int largestElement(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        for(int i : arr){
            max = Math.max(max,i);
        }
        return max;
    }
}
