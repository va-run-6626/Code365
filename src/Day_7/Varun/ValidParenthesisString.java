package Day_7.Varun;
import java.util.*;

public class ValidParenthesisString {
    public static void main(String[] args) {
        String s = "((((()(()()()*()(((((*)()*(**(())))))(())()())(((())())())))))))(((((())*)))()))(()((*()*(*)))(*)()";
        boolean ans = checkValidString(s);
        System.out.println(ans);
    }

    private static boolean checkValidString(String s) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> starStack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                stack.push(i);
            }else if(ch == '*'){
                starStack.push(i);
            }else{
                if(!stack.isEmpty()){
                    stack.pop();
                }else if(!starStack.isEmpty()){
                    starStack.pop();
                }else{
                    return false;
                }
            }
        }
        while(!stack.isEmpty() && !starStack.isEmpty()){
            if(stack.pop() > starStack.pop()){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
