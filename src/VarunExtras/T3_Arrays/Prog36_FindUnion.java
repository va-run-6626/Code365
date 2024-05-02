package VarunExtras.T3_Arrays;
import java.util.*;

public class Prog36_FindUnion {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 6};
        int[] arr2 = {2, 3, 5};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        List<Integer> ans = union(arr1, arr2);
        System.out.println(ans);
    }
    public static List< Integer > union(int []arr1, int []arr2) {
        int i = 0, j = 0;
        int n = arr1.length;
        int m = arr2.length;
        ArrayList<Integer > Union=new ArrayList<>(); // Uninon vector
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                if (Union.size() == 0 || Union.get(Union.size()-1) != arr1[i])
                    Union.add(arr1[i]);
                i++;
            } else {
                if (Union.size() == 0 || Union.get(Union.size()-1) != arr2[j])
                    Union.add(arr2[j]);
                j++;
            }
        }
        while (i < n) {
            if (Union.get(Union.size()-1) != arr1[i])
                Union.add(arr1[i]);
            i++;
        }while (j < m) {
            if (Union.get(Union.size()-1) != arr2[j])
                Union.add(arr2[j]);
            j++;
        }
        return Union;
    }
}
