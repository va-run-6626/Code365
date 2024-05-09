package VarunExtras.T1_Basics;

public class Prog5_armstrongNumber {
    public static void main(String[] args) {
        int n = 153;
        boolean isarm = solve(n);
        System.out.println(isarm);
    }

    private static boolean solve(int n) {
        int rec = n;
        int cal = 0;
        while(n > 0){
            int r =  n % 10;
            cal += r * r * r;
            n /=10;
        }
        return cal == rec;
    }
}
