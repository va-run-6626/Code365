package VarunExtras.T1_Basics;

public class Prog15_StringIsPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean ans = Solution.isPalindrome(s);
        System.out.println(ans);
    }
    class Solution {
        public static boolean isPalindrome(String s) {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if(c >= 'A' && c <= 'Z'){
                    c = Character.toLowerCase(c);
                    sb.append(c);
                }else if(c >= 'a' && c <= 'z'){
                    sb.append(c);
                }else if(c >= '0' && c <= '9'){
                    sb.append(c);
                }
            }
            String check = sb.toString();
            int i = 0;
            int j = check.length()-1;
            while(i <= j){
                if(check.charAt(i) != check.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }
    }
}
