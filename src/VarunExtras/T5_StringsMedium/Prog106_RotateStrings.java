package VarunExtras.T5_StringsMedium;

public class Prog106_RotateStrings {
    public static void main(String[] args) {
        String a = "abcde";
        String goal = "cdeab";

        boolean isRotated = solve1(a,goal);
        System.out.println(isRotated);
        isRotated = solve2(a,goal);
        System.out.println(isRotated);
    }

    private static boolean solve2(String a, String goal) {
        a = a +a;
        int i = 0;
        int j = 0;
        while(i < a.length()){
            if(a.charAt(i) == goal.charAt(j)){
                i++;
                j++;
                if(j == goal.length()) return true;
            }else if(j != 0){
                j = 0;
            }else{
                i++;
            }
        }
        return false;
    }

    private static boolean solve1(String a, String goal) {
        StringBuilder sb = new StringBuilder(a);
        for(int i = 0; i < a.length(); i++){
            char ch = sb.charAt(0);
            sb.append(ch);
            sb.deleteCharAt(0);
            if(sb.toString().equals(goal)){
                return true;
            }
        }
        return false;
    }
}
