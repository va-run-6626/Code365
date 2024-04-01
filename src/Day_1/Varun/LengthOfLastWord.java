package Day_1.Varun;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "  we are starting 365 days of code  ";
        int lenOfLastWord = new Solution1().lengthOfLastWord(s);
        System.out.println(lenOfLastWord);
    }
}
class Solution1 {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int i = s.length()-1;
        int l = 0;
        while(i >= 0 && s.charAt(i) != ' '){
            l++;
            i--;
        }
        return l;
    }
}