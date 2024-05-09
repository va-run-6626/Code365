package VarunExtras.T1_Basics;

public class Prog10_Printing1Ton {
    public static void main(String[] args) {
        int n = 6;
        funtion(n,1);
    }

    private static void funtion(int n, int i) {
        if(i == n+1){
            return;
        }
        System.out.println(i);
        funtion(n,++i);
    }
}
