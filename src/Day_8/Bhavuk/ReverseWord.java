package Day_8.Bhavuk;

public class ReverseWord {
    public static void main(String[] args) {
        String s = " Day 8 of 365 Days Of Code ";
        String reversedString = new Solution().reverseWords(s);
        System.out.println(reversedString);
    }
}
class Solution {
    public String reverseWords(String s) {
        int i = s.length()-1;
        int j;
        StringBuilder sbr = new StringBuilder("");
        while(i>=0){
            while(i>=0 && s.charAt(i)==' ') i--;
            j = i;
            if(i<0){
                break;
            }
            while(i>=0 && s.charAt(i)!=' ') i--;

            if(sbr.length() == 0){
                sbr.append(s.substring(i+1,j+1));
            }else{
                sbr.append(" " + (s.substring(i+1,j+1)));
            }
        }
        return sbr.toString();
    }
}

