package VarunExtras.T4_BinarySearch;

import java.util.ArrayList;

public class Prog95_KthElementOfTwoSortedArrays {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(){
            {
                add(2);
                add(3);
                add(6);
                add(7);
                add(9);
            }
        };
        ArrayList<Integer> arr2 = new ArrayList<>(){
            {
                add(1);
                add(4);
                add(8);
                add(10);
            }
        };
        int k = 4;
        int num = kthElement1(arr1,arr2,arr1.size(),arr2.size(),k);
        System.out.println(num);
        num = kthElement2(arr1,arr2,arr1.size(),arr2.size(),k);
        System.out.println(num);
    }

    private static int kthElement2(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n1, int n2, int k) {
        if(arr2.size() < arr1.size()) return kthElement2(arr2, arr1, n2, n1, k);
        int low = Math.max(0,k - n2);
        int high = Math.min(k,n1);

        int left = k;
        while(low <= high){
            int cut1 = (low + high) >> 1;
            int cut2 = left - cut1;

            int l1 = cut1 == 0 ? Integer.MIN_VALUE :arr1.get(cut1 -1);
            int l2 = cut2 == 0 ? Integer.MIN_VALUE :arr2.get(cut2 -1);

            int r1 = cut1 == n1 ? Integer.MAX_VALUE :arr1.get(cut1);
            int r2 = cut2 == n2 ? Integer.MAX_VALUE :arr2.get(cut2);

            if(l1 <= r2 && l2 <= r1){
                return Math.max(l1,l2);
            }else if(l1 > r2){
                high = cut1 -1;
            }else{
                low = cut1 +1;
            }
        }
        return 0;
    }

    private static int kthElement1(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m, int k) {
        int idx = -1;
        int i = 0;
        int j = 0;

        int ans = -1;

        while(i < n && j < m){
            if(idx < k){
                idx++;
                if(arr1.get(i) <= arr2.get(j)){
                    ans = arr1.get(i++);
                }else{
                    ans = arr2.get(j++);
                }
                if(idx == k-1) return ans;
            }
        }
        while(i < n){
            if(idx < k){
                idx++;
                ans = arr1.get(i);
                if(idx == k-1) return ans;
            }
        }
        while(j < m){
            if(idx < k){
                idx++;
                ans = arr2.get(j);
                if(idx == k-1) return ans;
            }
        }
        return -1;
    }
}
