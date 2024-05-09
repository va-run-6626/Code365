package VarunExtras.T5_StringsMedium;

public class Prog108_maximumNestingDepthOfParenthsis {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(new Solution108().maxDepth(s));
    }
}
class Solution108 {
    public int maxDepth(String s) {
        int cnt = 0;
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(')cnt++;
            else if(s.charAt(i) == ')')cnt--;
            max = Math.max(max,cnt);
        }
        return max;
    }
}