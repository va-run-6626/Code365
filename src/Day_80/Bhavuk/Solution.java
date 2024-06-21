package Day_80.Bhavuk;

import java.util.Arrays;

class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n = position.length;
        int l =1;
        int h = position[n-1]-position[0];
        int res = -1;

        while(l <= h){

            int mid = l + (h-l)/2;
            int dist = calculate(position, mid);

            if(dist >= m){
                res = mid;
                l = mid+1;
            }
            else
                h = mid-1;
        }
        return res;
    }


    int calculate(int[] arr, int mid){
        int ball = 1;
        int pos = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i]-pos >= mid){
                ball++;

                pos = arr[i];
            }
        }
        return ball;
    }

}