package Day_5.Varun;

public class MakeTheStringGreat {
    public static void main(String[] args) {
        String s = "leEeetcode";
        String ans = makeGood(s);
        System.out.println(ans);
    }

    private static String makeGood(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        while(i < sb.length()-1){
            if(sb.charAt(i) != sb.charAt(i+1) && Character.toLowerCase(sb.charAt(i)) == Character.toLowerCase(sb.charAt(i+1))){
                sb.deleteCharAt(i);
                sb.deleteCharAt(i);
                i = Math.max(0,i-1);
            }else{
                i++;
            }
        }
        return sb.toString();
    }
}
