package Day_7.Bhavuk;

public class ValidPalindrome2 {
    public static void main(String[] args) {
        String s = "aba";
        boolean res = new Solution().validPalindrome(s) ;
        if(res){
            System.out.println("Valid Palindrome");
        }else System.out.println("Invalid");
    }
}
class Solution {
    public boolean validPalindrome(String s) {
        int sindx = 0;
        int eindx = s.length()-1;
        while(sindx<=eindx){
            if(s.charAt(sindx)==s.charAt(eindx)){
                sindx++;
                eindx--;
            }else{
                return isPalindrome(s,sindx+1,eindx) || isPalindrome(s,sindx,eindx-1);
            }
        }
        return true;

    }
    public boolean isPalindrome(String s, int sindx, int eindx){
        while(sindx<=eindx){
            if(s.charAt(sindx)==s.charAt(eindx)){
                sindx++;
                eindx--;
            }else{
                return false;
            }
        }
        return true;
    }
}