package Day_63.Varun;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] string = {'h','e','l','l','o'};
        System.out.println(Arrays.toString(string));
        Solution solution = new Solution();
        solution.reverse(string);
        System.out.println(Arrays.toString(string));
    }
}
class Solution {
    public void reverse(char[] s) {
        for(int i = 0, j = s.length-1; i <= j ; i++, j--){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}