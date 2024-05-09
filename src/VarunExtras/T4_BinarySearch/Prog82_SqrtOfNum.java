package VarunExtras.T4_BinarySearch;

public class Prog82_SqrtOfNum {
    public static void main(String[] args) {
        int num = 26;
        int rt = sqrt(num);
        System.out.println(rt);
    }

    private static int sqrt(int x) {
        int s = 1;
        int e = x;
        while(s <= e){
            int m = s + (e - s)/2;
            if(m <= x/m && (m+1) > x/m) return m;
            else if(m > x/m) e = m -1;
            else s = m +1;
        }
        return e;
    }
}
