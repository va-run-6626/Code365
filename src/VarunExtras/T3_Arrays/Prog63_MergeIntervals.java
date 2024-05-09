package VarunExtras.T3_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prog63_MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {
                {1, 3}, {2, 4}, {3, 5}, {6, 7}
        };
        List<int[]> ans = solve(intervals);
        for(int[] a : ans){
            System.out.println(Arrays.toString(a));
        }
    }

    private static List<int[]> solve(int[][] intervals) {
        List<int[]> arr = new ArrayList<>();
        if(intervals == null || intervals.length == 0){
            return arr;
        }
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
        int s = intervals[0][0];
        int e = intervals[0][1];
        for(int[] i : intervals){
            if(i[0] <= e){
                e = Math.max(e,i[1]);
            }else{
                arr.add(new int[]{s,e});
                s = i[0];
                e = i[1];
            }
        }
        arr.add(new int[]{s,e});
        return arr;
    }
}
