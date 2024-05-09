package VarunExtras.T1_Basics;

public class Prog1_CountDigits {
    public static void main(String[] args) {
        int a = 12345;
        int digits = solve(a);
        System.out.println(digits);
    }

    private static int solve(int a) {
        int num = 0;
        while(a > 0){
            num++;
            a /= 10;
        }
        return num;
    }
}
