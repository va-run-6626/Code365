package VarunExtras.T4_BinarySearch;

public class Prog76_SearchInrotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {2,5,6,0,0,1,2};
        int target = 0;
        System.out.println(search(arr,target));
    }

    private static int search(int[] arr, int target) {
        int pivot = findPivot(arr);
        if(pivot == -1){
            return bs(arr,target,0,arr.length-1);
        }
        if(arr[pivot] == target) return pivot;
        int ans = bs(arr,target,0,pivot);
        if(ans == -1){
            ans = bs(arr,target,pivot+1,arr.length-1);
        }
        return ans;
    }
    private static int bs(int[] arr, int target, int s , int e){
        while(s <= e){
            int mid = s +(e-s)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                e = mid-1;
            }else{
                s = mid +1;
            }
        }
        return  -1;
    }

    private static int findPivot(int[] arr) {
        int l = 0;
        int h = arr.length-1;
        while (l <= h){
            int m = l + (h - l)/2;
            if(m < h && arr[m] > arr[m+1])return m;
            if(m > l && arr[m] < arr[m-1])return m-1;
            if(arr[l] >= arr[m]){
                h = m -1;
            }else{
                l = m +1;
            }
        }
        return -1;
    }
}
