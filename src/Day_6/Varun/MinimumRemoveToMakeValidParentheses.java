package Day_6.Varun;

import java.util.Stack;

public class MinimumRemoveToMakeValidParentheses {
    public static void main(String[] args) {
        String s = "lee(t(c)o)de)";
        String sol = minRemoveToMakeValid(s);
        System.out.println(sol);
    }

    private static String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '('){
                stack.push(i);
            }else if(ch == ')'){
                if(!stack.isEmpty() && s.charAt(stack.peek()) == '('){
                    stack.pop();
                }else{
                    stack.push(i);
                }
            }
        }

        while (!stack.isEmpty()){
            sb.deleteCharAt(stack.pop());
        }
        return sb.toString();
    }
}
