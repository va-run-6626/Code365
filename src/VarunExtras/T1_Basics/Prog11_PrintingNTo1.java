package VarunExtras.T1_Basics;

public class Prog11_PrintingNTo1 {
    public static void main(String[] args) {
        int n = 6;
        funtion(n);
    }

    private static void funtion(int n) {
        if(n == 0){
            return;
        }
        System.out.println(n);
        funtion(--n);
    }
}
