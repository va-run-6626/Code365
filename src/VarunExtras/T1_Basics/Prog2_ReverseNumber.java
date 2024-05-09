package VarunExtras.T1_Basics;

public class Prog2_ReverseNumber {
    public static void main(String[] args) {
        int a = 12345;
        int num = solve(a);
        System.out.println(num);
    }

    private static int solve(int x) {
        int num = 0;
        if(x > num) num = x;
        else num -= x;

        int rev = 0;
        while(num > 0){
            int r = num % 10;
            if(rev > (Integer.MAX_VALUE - r)/10) return 0;
            num /=10;
            rev = rev * 10 +r;
        }

        if(x > 0){
            return rev;
        }
        return 0-rev;
    }
}
