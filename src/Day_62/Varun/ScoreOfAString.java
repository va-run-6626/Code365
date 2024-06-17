package Day_62.Varun;
public class ScoreOfAString {
    public static void main(String[] args) {
        String s = "hello";
        int score = new Solution().scoreOfString(s);
        System.out.println(score);
    }
}
class Solution{
    public int scoreOfString(String s){
        int ans = 0;
        for(int i = 0; i < s.length()-1; i++){
            ans += Math.abs(s.charAt(i) - s.charAt(i+1));
        }
        return ans;
    }
}