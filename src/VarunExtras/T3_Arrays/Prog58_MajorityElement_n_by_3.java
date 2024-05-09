package VarunExtras.T3_Arrays;
import java.util.*;
public class Prog58_MajorityElement_n_by_3 {
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        System.out.println(majorityElement(arr));
    }

    private static List<Integer> majorityElement(int[] nums) {
        int num1 = -1, num2 = -1;
        int c1 = 0, c2 = 0;
        for(int i : nums){
            if(i == num1)c1++;
            else if(i == num2)c2++;
            else if(c1 == 0){
                num1 = i;
                c1++;
            }else if(c2 == 0){
                num2 = i;
                c2++;
            }else{
                c1--;
                c2--;
            }
        }
        c1 = 0;
        c2 = 0;
        for(int i : nums){
            if(i == num1)c1++;
            if(i == num2)c2++;
        }
        List<Integer> ans = new ArrayList<>();
        if(num1 == num2) ans.add(num1);
        else{
            if(c1 > nums.length/3) ans.add(num1);
            if(c2 > nums.length/3) ans.add(num2);
        }
        return ans;
    }
}
