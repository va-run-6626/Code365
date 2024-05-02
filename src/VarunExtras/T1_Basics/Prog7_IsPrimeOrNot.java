package VarunExtras.T1_Basics;

public class Prog7_IsPrimeOrNot {
    public static void main(String[] args) {
        int n = 37;
        System.out.println(isPrime(n));
    }

    private static boolean isPrime(int n) {
        for(int i = 2; i < Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}
