package Day_72.Bhavuk;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];
        int k = 0;
        for(int i : arr1){
            count[i]++;
        }
        for(int j : arr2){
            while(count[j]!=0){
                arr1[k++] = j;
                count[j]--;
            }
        }
        for(int num = 0; num<1001; num++){
            while(count[num]!=0){
                arr1[k++]=num;
                count[num]--;
            }
        }
        return arr1;
    }
}