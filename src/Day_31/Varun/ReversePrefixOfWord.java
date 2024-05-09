package Day_31.Varun;

public class ReversePrefixOfWord {
    public static void main(String[] args) {
        String s = "ascdvgbhjuh";
        char ch = 'g';
        String ans = new Solution().reversePrefix(s,ch);
        System.out.println(ans);
    }
    static class Solution {
        public String reversePrefix(String word, char ch) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            for(i = 0; i < word.length(); i++){
                if(word.charAt(i) == ch){
                    break;
                }
            }
            if(i == word.length()) return word;
            if(i+1 == word.length()){
                sb.append(word);
            }else{
                sb.append(word.substring(0,i+1));
            }
            sb.reverse();
            if(i+1 != word.length())
                sb.append(word.substring(i+1));
            return sb.toString();
        }
    }
}
