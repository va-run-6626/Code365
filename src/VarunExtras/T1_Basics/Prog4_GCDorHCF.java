package VarunExtras.T1_Basics;

public class Prog4_GCDorHCF {
    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        int brute = solve1(a,b);
        System.out.println(brute);
        int optimal = solve2(a,b);
        System.out.println(optimal);
    }

    private static int solve2(int a, int b) {
        if(b == 0) {
            return a;
        }
        return solve2(b, a % b);
    }

    private static int solve1(int a, int b) {
        if(a == 0) return b;
        if(b == 0) return a;
        if(a == b) return a;
        if(a > b) return solve1(a-b,b);
        return solve1(a,b-a);
    }
}
