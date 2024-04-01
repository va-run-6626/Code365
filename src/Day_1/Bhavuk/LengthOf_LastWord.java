package Day_1.Bhavuk;

public class LengthOf_LastWord {
    public static void main(String[] args) {
        String name = "Hello everyone ";
        int n = new Solution1().lengthOfLastWord(name);
        System.out.println(n);
    }
}
class Solution1 {
    public int lengthOfLastWord(String s) {
        int n = s.length()-1;
        int count = 0;
        for(int i = n; i>=0; i--){
            if(s.charAt(i)!=' '){
                count++;
            }else{
                if(count>0){
                    return count;
                }
            }
        }
        return count;

    }
}