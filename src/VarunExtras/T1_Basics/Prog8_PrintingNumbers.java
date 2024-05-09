package VarunExtras.T1_Basics;

public class Prog8_PrintingNumbers {
    public static void main(String[] args) {
        function(0);
    }

    private static void function(int n) {
        if(n == 6) return;
        System.out.println(n);
        function(++n);
    }
}
