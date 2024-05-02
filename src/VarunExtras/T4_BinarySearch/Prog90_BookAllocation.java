package VarunExtras.T4_BinarySearch;

import java.util.ArrayList;

public class Prog90_BookAllocation {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(){
            {
                add(25);
                add(46);
                add(28);
                add(49);
                add(24);
            }
        };
        int m = 4;
        int minPages = findPages(list,list.size(), m);
        System.out.println(minPages);
    }

    private static int findPages(ArrayList<Integer> list, int size, int m) {
        if(m > size) return -1;
        int s = Integer.MIN_VALUE;
        int e = 0;
        for(Integer i : list){
            s = Math.max(s,i);
            e += i;
        }
        while (s <= e){
            int mid = s + (e - s)/2;
            int students = countStudents(list,mid);
            if(students > m){
                s = mid +1;
            }else{
                e = mid -1;
            }
        }
        return s;
    }

    private static int countStudents(ArrayList<Integer> list, int mid) {
        int cnt = 0;
        int currAlloc = 0;
        int n = list.size();
        for(int i = 0; i < n; i++){
            if(list.get(i) + currAlloc <= mid){
                currAlloc += list.get(i);
            }else{
                cnt++;
                currAlloc = list.get(i);
            }
        }
        cnt++;
        return cnt;
    }
}
