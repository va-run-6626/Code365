package Day_64.Varun;

public class AppendCharactersToStringToMakeSubsequence {
    public static void main(String[] args) {
        String s = "coaching";
        String t = "coding";
        int num = new Solution().appendCharacters(s,t);
        System.out.println(num);
    }
}
class Solution {
    public int appendCharacters(String s, String t) {
        int i = 0;
        int j = 0;
        int n = s.length();
        int m = t.length();
        while(i < n && j < m){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }else{
                i++;
            }
        }
        return m - j;
    }
}