package VarunExtras.T5_StringsMedium;

import java.util.Stack;

public class Prog102_ReverseWordsInAGivenString {
    public static void main(String[] args) {
        String s = "the sky is blue";
        String ans = reverse(s);
        System.out.println(ans);
    }

    private static String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        Stack<String> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ' '){
                if(sb.length() > 0){
                    stack.push(sb.toString());
                    sb.setLength(0);
                }
            }else{
                sb.append(ch);
            }
        }
        if(sb.length() > 0) stack.push(sb.toString());
        sb.setLength(0);

        if(stack.isEmpty()) return "";
        while(stack.size() > 1){
            sb.append(stack.peek()).append(" ");
            stack.pop();
        }
        sb.append(stack.pop());
        return sb.toString();
    }
}
