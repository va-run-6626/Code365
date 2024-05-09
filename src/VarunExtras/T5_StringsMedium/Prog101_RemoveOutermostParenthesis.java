package VarunExtras.T5_StringsMedium;

public class Prog101_RemoveOutermostParenthesis {
    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        System.out.println(removeOuterParentheses(s));
    }

    private static String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int open = 0, close = 0, start = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(') open++;
            else if(s.charAt(i) == ')')close++;
            if(open == close){
                sb.append(s.substring(start+1,i));
                start = i+1;
            }
        }
        return sb.toString();
    }
}
