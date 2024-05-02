package VarunExtras.T3_Arrays;

public class Prog35_LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 7;
        int indx = linearSearch(arr.length,target,arr);
        System.out.println(indx);
    }
    public static int linearSearch(int n, int num, int []arr){
        for(int i = 0; i < n; i++){
            if(arr[i] == num) return i;
        }
        return -1;
    }
}
