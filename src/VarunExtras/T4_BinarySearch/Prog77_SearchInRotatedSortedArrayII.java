package VarunExtras.T4_BinarySearch;

public class Prog77_SearchInRotatedSortedArrayII {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        int target = 2;
        System.out.println(search(arr,target));
    }

    private static boolean search(int[] arr, int target) {
        int s = 0;
        int e = arr.length-1;
        while(s <= e){
            int mid = s + (e -s)/2;
            if(arr[mid] == target) return true;

            if(arr[s] == arr[mid] && arr[mid] == arr[e]){
                s++;
                e--;
                continue;
            }
            if(arr[s] <= arr[mid]){
                if(arr[s] <= target && target <= arr[mid]){
                    e = mid -1;
                }else{
                    s = mid +1;
                }
            }else{
                if(arr[mid] <= target && target <= arr[e]){
                    s = mid +1;
                }else{
                    e = mid -1;
                }
            }
        }
        return false;
    }
}
