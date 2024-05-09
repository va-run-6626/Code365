package VarunExtras.T4_BinarySearch;

import java.util.ArrayList;

public class Prog92_PaintersPartition {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(){
            {
                add(2);
                add(1);
                add(5);
                add(6);
                add(2);
                add(3);
            }
        };
        int k = 2;
        int ans = findLargestMinDistance(arr,k);
        System.out.println(ans);
    }
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k){
        int s = 0;
        int e = 0;
        for(int i : boards){
            s = Math.max(s, i);
            e += i;
        }
        while(s <= e){
            int m = s + (e - s)/2;
            int painters = calPainters(boards,m);
            if(painters > k){
                s = m+1;
            }else{
                e = m-1;
            }
        }
        return s;
    }
    public static int calPainters(ArrayList<Integer> boards, int mid){
        int n = boards.size();
        int cnt = 0;
        int alloc = 0;
        for(int i = 0; i < n; i++){
            if(boards.get(i) + alloc <= mid){
                alloc += boards.get(i);
            }else{
                cnt++;
                alloc = boards.get(i);
            }
        }
        cnt++;
        return cnt;
    }
}
