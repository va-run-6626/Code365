package VarunExtras.T4_BinarySearch;

public class Prog80_SingleElementInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4,5,6,6};
        System.out.println(singleElement(arr));
    }

    private static int singleElement(int[] arr) {
        int n = arr.length;
        if(n == 1) return arr[0];
        if(arr[0] != arr[1]) return arr[0];
        if(arr[n-1] != arr[n-2]) return arr[n-1];
        int s = 0;
        int e = arr.length-1;
        while(s <= e){
            int mid = s + (e - s)/2;
            if(arr[mid] != arr[mid+1] && arr[mid] != arr[mid-1]){
                return arr[mid];
            }
            if((mid % 2 == 1 && arr[mid-1] == arr[mid]) || mid % 2 == 0 && arr[mid+1] == arr[mid]){
                s = mid +1;
            }else{
                e = mid -1;
            }
        }
        return -1;
    }
}
