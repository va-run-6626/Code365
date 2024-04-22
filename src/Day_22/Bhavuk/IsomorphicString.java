package Day_22.Bhavuk;
import java.util.HashMap;

public class IsomorphicString {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        System.out.println(solution.isIsomorphic("egg", "add")); // true
        System.out.println(solution.isIsomorphic("foo", "bar")); // false
        System.out.println(solution.isIsomorphic("paper", "title")); // true
    }
}
 class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hasm = new HashMap<>();
        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < t.length(); i++) {
            Character original = s.charAt(i);
            Character replacement = t.charAt(i);
            if (!hasm.containsKey(original)) {
                if (!hasm.containsValue(replacement)) {
                    hasm.put(original, replacement);
                } else {
                    return false;
                }
            } else {
                Character mappedReplacement = hasm.get(original);
                if (mappedReplacement != replacement) {
                    return false;
                }
            }
        }
        return true;
    }
}
