package VarunExtras.T5_StringsMedium;
import java.util.*;
public class Prog111_CamelcaseMatching {
    public static void main(String[] args) {
        String[] queries = {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
        String pattern = "FoBaT";

        List<Boolean> ans = new SolutionCamel().camelMatch(queries,pattern);
        System.out.println(ans);
    }
}
class SolutionCamel{
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> ans = new ArrayList<>();
        List<String> pat = extractPattern(pattern);
        System.out.println(pat);
        for(String s : queries){
            boolean isCurrPattern = isCurrentPattern(s,pat);
            ans.add(isCurrPattern);
        }
        return ans;
    }
    private boolean isCurrentPattern(String s, List<String> pat){
        String temp = s;
        int i = 1;
        for(String pattern : pat){
            if(temp.startsWith(pattern)){
                while(temp.charAt(i) >= 'a' && temp.charAt(i) <= 'z' && i < temp.length()) i++;
                if(i < temp.length())
                    temp = temp.substring(i);
                else
                    temp ="";
                i = 1;
            }
        }
        return temp.isBlank();
    }
    private List<String> extractPattern(String pattern){
        List<String> pat = new ArrayList<>();
        int i = 0;
        int j = 1;
        while(i < pattern.length() && j < pattern.length()){
            if(pattern.charAt(j) >= 'a' && pattern.charAt(j) <= 'z'){
                j++;
            }else if(pattern.charAt(j) >= 'A' && pattern.charAt(j) <= 'Z'){
                pat.add(pattern.substring(i,j));
                i = j;
                j = i+1;
            }
        }
        pat.add(pattern.substring(i));
        return pat;
    }
}
