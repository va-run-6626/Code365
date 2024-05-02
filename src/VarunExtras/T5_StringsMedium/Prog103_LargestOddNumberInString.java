package VarunExtras.T5_StringsMedium;

public class Prog103_LargestOddNumberInString {
    public static void main(String[] args) {
        String num = "356847";
        System.out.println(largestOddNumber(num));
    }

    private static String largestOddNumber(String num) {
        StringBuilder sb = new StringBuilder();
        int inc = 0;
        for(int i = num.length()-1; i >= 0; i--){
            char ch = num.charAt(i);
            if(isOdd(ch) && inc == 0){
                sb.insert(0,ch);
                inc++;
            }else if(inc == 1){
                sb.insert(0,ch);
            }else{
                continue;
            }
        }
        return sb.toString();
    }

    private static boolean isOdd(char ch) {
        return (ch == '1' || ch == '3'|| ch == '5'|| ch == '7'|| ch == '9');
    }
}
