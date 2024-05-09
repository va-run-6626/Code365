package VarunExtras.T3_Arrays;

import java.util.ArrayList;

public class Prog67_ReversePairs {
    public static void main(String[] args) {
        int[] nums = {727,349,916,7,595,873,516,960,976,170,662,317,529,702,789,256,75,575,330,339,584,239,31,173,929,967,20,654,780,478,337,67,343,14,415,842,908};


        int cnt = reversePairs(nums);
        System.out.println(cnt);
    }

    private static int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }

    private static int mergeSort(int[] nums, int low, int high) {
        int cnt = 0;
        if(low >= high) return cnt;
        int mid = low + (high - low)/2;
        cnt += mergeSort(nums,low,mid);
        cnt += mergeSort(nums,mid+1,high);
        cnt += countingPairs(nums,low,mid,high);
        merge(nums,low,mid,high);
        return cnt;
    }

    private static int countingPairs(int[] nums, int low, int mid, int high) {
        int right = mid +1;
        int cnt = 0;
        for(int left = low; left <= mid; left++){
            while(right <= high && nums[left] > 2 * nums[right]) right++;
            cnt += (right - (mid +1));
        }
        return cnt;
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
}
