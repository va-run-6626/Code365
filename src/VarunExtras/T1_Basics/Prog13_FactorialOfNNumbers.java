package VarunExtras.T1_Basics;

public class Prog13_FactorialOfNNumbers {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fact(n));
    }

    private static int fact(int n) {
        if(n == 1) return 1;
        return n * fact(n-1);
    }
}
