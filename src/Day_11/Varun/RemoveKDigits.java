package Day_11.Varun;

import java.awt.datatransfer.StringSelection;
import java.util.Stack;

public class RemoveKDigits {
    public static void main(String[] args) {
        String s = "1432219";
        int k = 3;
        String smallNumber = removeKDigits(s,k);
        System.out.println(smallNumber);
    }

    private static String removeKDigits(String s, int k) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            while(!stack.isEmpty() && k > 0 && stack.peek() > ch){
                stack.pop();
                k--;
            }
            stack.push(ch);
        }
        while(k > 0 && !stack.isEmpty()){
            stack.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        sb.reverse();
        while(sb.length() > 0 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }
        return sb.length() > 0 ? sb.toString() : "0";
    }
}
