package VarunExtras.T3_Arrays;

public class Prog30_RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,24,4,4,4,5,5,5,5};
        int size = removeDuplicates(arr,arr.length);
        System.out.println(size);
    }
    public static int removeDuplicates(int[] arr,int n) {
        int i = 0; int j = 0;
        while(j < n){
            if(arr[i] == arr[j])j++;
            else{
                i++;
                arr[i] = arr[j];
                j++;
            }
        }
        return i+1;
    }
}
