package VarunExtras.T3_Arrays;

import java.util.ArrayList;

public class Prog66_CountInversions {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 1, 4};
        int cnt = count(arr, arr.length);
        System.out.println(cnt);
    }

    private static int count(int[] arr, int n) {
        return mergeSort(arr,0,n-1);
    }

    private static int mergeSort(int[] arr, int left, int right) {
        int cnt = 0;
        if(left >= right) return cnt;
        int mid = (left + right)/2;
        cnt += mergeSort(arr,left,mid);
        cnt += mergeSort(arr,mid+1,right);
        cnt += merge(arr,left,mid,right);
        return cnt;
    }

    private static int merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> list = new ArrayList<>();
        int left = low;
        int right = mid +1;

        int cnt = 0;
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                list.add(arr[left]);
                left++;
            }else{
                list.add(arr[right]);
                cnt += (mid - left +1);
                right++;
            }
        }
        while(right <= high){
            list.add(arr[right++]);
        }
        while(left <= mid){
            list.add(arr[left++]);
        }
        for(int i = low; i <= high; i++){
            arr[i] = list.get(i-low);
        }
        return cnt;
    }
}
