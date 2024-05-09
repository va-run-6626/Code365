package VarunExtras.T5_StringsMedium;
import java.util.Arrays;
public class Prog104_LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr = {"flower","flow","flight"};
        String prefix = longestCommonPrefix(arr);
        System.out.println(prefix);
    }

    private static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder();
        String first = strs[0];
        String last = strs[strs.length-1];
        int len = Math.min(first.length(), last.length());
        for(int i = 0; i < len; i++){
            if(first.charAt(i) != last.charAt(i)){
                return sb.toString();
            }
            sb.append(first.charAt(i));
        }
        return sb.toString();
    }
}
