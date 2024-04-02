package Day_2.Varun;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        boolean isIsomorphic = new Solution2().isIsomorphic(s,t);
        System.out.println(isIsomorphic);
    }
}
class Solution2 {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] sMap = new int[256];
        int[] tMap = new int[256];
        for(int i = 0; i < s.length(); i++){
            if(sMap[s.charAt(i)] != tMap[t.charAt(i)]){
                return false;
            }
            sMap[s.charAt(i)] = i+1;
            tMap[t.charAt(i)] = i+1;
        }
        return true;
    }
}