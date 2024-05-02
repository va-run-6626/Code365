package VarunExtras.T4_BinarySearch;

public class Prog87_CapacityToShipPackagesWithinDDays {
    public static void main(String[] args) {
        int[] wts = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        int minWt = shipWithinDays(wts, days);
        System.out.println(minWt);
    }

    private static int shipWithinDays(int[] weights, int days) {
        int s = Integer.MIN_VALUE;
        int e = 0;
        for(int i : weights){
            e += i;
            s = Math.max(s,i);
        }
        while(s <= e){
            int mid = s + (e - s)/2;
            int d = findDays(mid,weights);
            if(d <= days){
                e = mid -1;
            }else{
                s = mid +1;
            }
        }
        return s;
    }
    public static int findDays(int wt, int[]wts){
        int day = 0;
        int currWt = 0;
        for(int i = 0; i < wts.length; i++){
            if(wts[i] + currWt <= wt){
                currWt += wts[i];
            }else{
                day++;
                currWt = wts[i];
            }
        }
        day++;
        return day;
    }
}
