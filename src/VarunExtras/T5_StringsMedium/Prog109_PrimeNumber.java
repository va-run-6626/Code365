package VarunExtras.T5_StringsMedium;

import java.util.Scanner;

public class Prog109_PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        boolean isPrime = isPrime(n);
        System.out.println("is the number prime ? --> "+isPrime);
    }

    private static boolean isPrime(int n) {
        if(n == 2) return true;
        if(n % 2 == 0) return false;
        int check = 2;
        while(check * check <= n){
            if(n % check == 0) return false;
            check++;
        }
        return true;
    }
}
