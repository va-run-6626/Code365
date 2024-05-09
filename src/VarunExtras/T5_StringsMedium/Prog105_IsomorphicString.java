package VarunExtras.T5_StringsMedium;

public class Prog105_IsomorphicString {
    public static void main(String[] args) {
        String a = "egg";
        String b = "add";
        boolean isIsomorphic = solve(a,b);
        System.out.println(isIsomorphic);
    }

    private static boolean solve(String a, String b) {
        int[] map1 = new int[200];
        int[] map2 = new int[200];

        if(a.length() != b.length()) return false;
        for(int i = 0; i < a.length(); i++){
            if(map1[a.charAt(i)] != map2[b.charAt(i)]) return false;
            map1[a.charAt(i)] = i+1;
            map2[b.charAt(i)] = i+1;
        }
        return true;
    }
}
