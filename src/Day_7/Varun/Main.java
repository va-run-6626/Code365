package Day_7.Varun;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String str = "(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())";
        boolean ans = new Solution().checkValidString(str);
        System.out.println(ans);
    }
}
class Solution {
    public boolean checkValidString(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for(int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')'){
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }else{
                count++;
            }
        }
        while(count>0){
            if(!stack.isEmpty()){
                stack.pop();
            }else{
                return true;
            }
            count--;
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }

    }
}
