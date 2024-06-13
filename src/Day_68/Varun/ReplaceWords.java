package Day_68.Varun;

import java.util.*;

public class ReplaceWords {
    public static void main(String[] args) {
        List<String> dict = new ArrayList<>();
        dict.add("cat"); dict.add("bat"); dict.add("rat");
        String sentence = "the cattle was rattled by the battery";

        String ans = new Solution().replaceWords(dict, sentence);
        System.out.println(ans);
    }
}
class Solution {
    public String replaceWords(List<String> dict, String sentence) {
        Set<String> s = new HashSet<>(dict);
        StringBuilder res = new StringBuilder();
        List<String> temp = new ArrayList<>(
                Arrays.asList(sentence.split(" "))
        );

        for (String t : temp) {
            int i = 0;
            while (i <= t.length()) {
                String curr = t.substring(0, i++);
                if (s.contains(curr)) {
                    res.append(curr).append(" ");
                    break;
                }

                if (i == t.length() + 1) res.append(t).append(" ");
            }
        }

        res.deleteCharAt(res.length() - 1);
        return res.toString();
    }
}