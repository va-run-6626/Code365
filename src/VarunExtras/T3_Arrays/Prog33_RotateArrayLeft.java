package VarunExtras.T3_Arrays;

import java.util.ArrayList;

public class Prog33_RotateArrayLeft {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(){
            {
                add(1);
                add(2);
                add(3);
                add(4);
                add(5);
            }
        };
        int k = 3;
        System.out.println(list);
        list = rotateArray(list,k);
        System.out.println(list);
    }
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        k %= arr.size();
        if(k == 0) return arr;
        reverse(arr,0,k-1);
        reverse(arr, k, arr.size()-1);
        reverse(arr,0,arr.size()-1);
        return arr;
    }
    private static void reverse(ArrayList<Integer> list, int i, int j){
        while(i <= j){
            int temp = list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
    }
}
