package VarunExtras.T3_Arrays;

import java.util.Arrays;

public class Prog27_SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(getSecondOrderElements(arr)));
    }

    private static int[] getSecondOrderElements(int[] a) {
        int secMax = getSecMax(a);
        int secMin = getSecMin(a);
        return new int[]{secMax,secMin};
    }
    private static int getSecMax(int[]a){
        int max = Integer.MIN_VALUE;
        for(int i : a){
            if(i > max){
                max = i;
            }
        }
        int secMax = Integer.MIN_VALUE;
        for(int i : a){
            if(i < max && i > secMax){
                secMax = i;
            }
        }
        return secMax;
    }
    private static int getSecMin(int[]a){
        int min = Integer.MAX_VALUE;
        for(int i : a){
            if(i < min){
                min = i;
            }
        }
        int secMin = Integer.MAX_VALUE;
        for(int i : a){
            if(i > min && i < secMin){
                secMin = i;
            }
        }
        return secMin;
    }
}
