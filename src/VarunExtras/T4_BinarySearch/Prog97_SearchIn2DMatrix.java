package VarunExtras.T4_BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class Prog97_SearchIn2DMatrix {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>(Arrays.asList(1 ,2 ,3 ,4)));
        list.add(new ArrayList<>(Arrays.asList(5 ,6 ,7 ,8)));
        list.add(new ArrayList<>(Arrays.asList(9 ,10 ,11 ,12)));

        int target = 8;
        System.out.println(searchMatrix1(list,target));
        System.out.println(searchMatrix2(list,target));
    }

    private static boolean searchMatrix2(ArrayList<ArrayList<Integer>> list, int target){
        int r = list.size();
        int c = list.get(0).size();

        int s = 0;
        int e = r * c -1;

        while(s <= e){
            int mid = s + (e - s)/2;
            int row = mid / c;
            int col = mid % c;
            if(list.get(row).get(col) == target) return true;
            else if(list.get(row).get(col) < target) s = mid +1;
            else e = mid -1;
        }
        return false;
    }

    private static boolean searchMatrix1(ArrayList<ArrayList<Integer>> list, int target) {
        int rows = list.size();
        int cols = list.get(0).size();
        if(rows == 1){
            return binarySearch(list,0,0,cols-1,target);
        }
        int rs = 0;
        int re = rows-1;
        int mc = cols /2;
        while(rs < re -1){
            int mr = rs + (re - rs)/2;
            if(list.get(mr).get(mc) == target) return true;
            else if(list.get(mr).get(mc) < target)rs = mr;
            else re = mr;
        }

        if(list.get(rs).get(mc) == target)return true;
        if(list.get(rs+1).get(mc) == target)return true;
        boolean ans = false;
        if(target < list.get(rs).get(mc)){
            ans =  binarySearch(list,rs,0,mc-1,target);
            if(ans) return ans;
        }
        if(target > list.get(rs).get(mc)){
            ans = binarySearch(list,rs,mc +1,cols-1,target);
            if(ans) return ans;
        }
        if(target < list.get(rs+1).get(mc)){
            ans = binarySearch(list,rs+1,0,mc-1,target);
            if(ans) return ans;
        }else{
            ans = binarySearch(list,rs+1,mc+1,cols-1,target);
        }
        return ans;
    }
    private static boolean binarySearch(ArrayList<ArrayList<Integer>> list , int row,int s, int e, int target){
        while(s <= e){
            int m = s + (e - s)/2;
            if(list.get(row).get(m) == target) return true;
            else if(list.get(row).get(m) > target) e = m -1;
            else s = m +1;
        }
        return false;
    }
}
