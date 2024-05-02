package VarunExtras.T3_Arrays;
import java.util.*;
public class Prog51_SuperiorElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2};
        System.out.println(superiorElements(arr));
    }
    public static List< Integer > superiorElements(int []a) {
        int max = a[a.length-1];
        List<Integer> list = new ArrayList<>();
        list.add(max);
        for(int i = a.length-2; i >= 0 ; i--){
            if(a[i] > max){
                list.add(a[i]);
                max = a[i];
            }
        }
        return list;
    }
}
