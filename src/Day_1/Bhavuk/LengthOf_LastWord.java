package Day_1.Bhavuk;

public class LengthOf_LastWord {
    public static void main(String[] args) {
        String name = "a";
        int n = new Solution1().lengthOfLastWord(name);
        System.out.println(n);
    }
}
class Solution1 {
    public int lengthOfLastWord(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int length = s.length();
        int count = 0;
        int i = length - 1;

        // Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count characters until a space or beginning of string
        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }

        return count;
    }
}
