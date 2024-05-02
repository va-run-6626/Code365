package VarunExtras.T3_Arrays;

import java.util.ArrayList;

public class Prog44_Sort_0_1_2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(){
            {
                add(2);
                add(2);
                add(2);
                add(2);
                add(0);
                add(0);
                add(1);
                add(0);
            }
        };
        System.out.println(arr);
        sort(arr,arr.size());
        System.out.println(arr);
    }

    private static void sort(ArrayList<Integer> arr, int n) {
        int l = 0;
        int m = 0;
        int h = n-1;
        while(m <=  h){
            switch(arr.get(m)){
                case 0:{
                    swap(arr,l,m);
                    l++;
                    m++;
                    break;
                }
                case 1:{
                    m++;
                    break;
                }
                case 2:{
                    swap(arr,m,h);
                    h--;
                }
            }
        }
    }
    private static void swap(ArrayList<Integer> arr, int i, int j){
        int temp = arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,temp);
    }
}
