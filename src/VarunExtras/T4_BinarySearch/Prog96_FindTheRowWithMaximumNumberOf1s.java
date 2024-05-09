package VarunExtras.T4_BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class Prog96_FindTheRowWithMaximumNumberOf1s {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>(Arrays.asList(0,0,1,1,1)));
        list.add(new ArrayList<>(Arrays.asList(0,0,0,0,0)));
        list.add(new ArrayList<>(Arrays.asList(0,1,1,1,1)));
        list.add(new ArrayList<>(Arrays.asList(0,0,0,0,0)));
        list.add(new ArrayList<>(Arrays.asList(0,1,1,1,1)));

        int n = list.size();
        int m = list.get(0).size();

        int row = findRow(list,n,m);
        System.out.println(row);
    }

    private static int findRow(ArrayList<ArrayList<Integer>> list, int n, int m) {
        int max = Integer.MIN_VALUE;
        int ans = -1;
        for(int i = 0; i < n; i++){
            int start = findStartEnd(list.get(i),true);
            int end = findStartEnd(list.get(i),false);
            int num = end - start +1;
            if(max < num){
                max = num;
                ans = i;
            }
        }
        return ans;
    }
    private static int findStartEnd(ArrayList<Integer> list , boolean isStart){
        int s = 0;
        int e = list.size()-1;
        int potAns = -1;
        while(s <= e){
            int mid = s + (e - s)/2;
            if(list.get(mid) == 1){
                potAns = mid;
                if(isStart){
                    e = mid -1;
                }else{
                    s = mid +1;
                }
            }else if(list.get(mid) == 0){
                s = mid +1;
            }else{
                e = mid -1;
            }
        }
        return potAns;
    }

}
