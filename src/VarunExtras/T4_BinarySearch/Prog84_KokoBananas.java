package VarunExtras.T4_BinarySearch;

public class Prog84_KokoBananas {
    public static void main(String[] args) {
        int[] arr = {7, 15, 6, 3};
        int h = 8;

        int minSpeed = minSpeed(arr,h);
        System.out.println(minSpeed);
    }

    private static int minSpeed(int[] piles, int h) {
        int s = 1;
        int e = Integer.MIN_VALUE;
        for(int i = 0; i < piles.length; i++){
            e = Math.max(piles[i], e);
        }
        while(s <= e){
            int mid = s + (e - s)/2;
            int th = hours(piles,mid);
            if(th <= h){
                e = mid -1;
            }else{
                s = mid +1;
            }
        }
        return s;
    }
    public static int hours(int[] piles, int speed){
        int th = 0;
        int n = piles.length;
        for(int i = 0; i < n; i++){
            th += Math.ceil((double)(piles[i])/(double)(speed));
        }
        return th;
    }
}
