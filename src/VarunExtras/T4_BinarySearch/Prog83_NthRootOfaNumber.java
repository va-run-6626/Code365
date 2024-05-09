package VarunExtras.T4_BinarySearch;

public class Prog83_NthRootOfaNumber {
    public static void main(String[] args) {
        int n = 3;
        int m = 27;
        System.out.println(Nthroot(n,m));
    }

    private static int Nthroot(int n, int m) {
        int s = 1;
        int e = m;
        while(s <= e){
            int mid = s + (e - s)/2;
            int cal = cal(mid,n,m);
            if(cal == 1) return mid;
            else if(cal == 2) e = mid -1;
            else s = mid +1;
        }
        return -1;
    }

    private static int cal(int mid, int n, int m) {
        long ans = 1;
        for(int i = 1; i <= n; i++){
            ans *= mid;
            if(ans > m) return 2;
        }
        if(ans == m) return 1;
        return 0;
    }
}
