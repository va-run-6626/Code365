package Code365.D_1;

public class Prog3_Palindrome {
    public static void main(String[] args) {
        int n = 123321;
        boolean ans = Solution.isPalindrome(n);
        System.out.println(ans);
    }
}
class  Solution {
    public static boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        int i = 0;
        int j = s.length()-1;
        while(i <= j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}