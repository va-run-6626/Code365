package VarunExtras.T4_BinarySearch;

public class Prog94_MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {2, 4, 6};
        int[] b = {1, 3, 5};
        double median = findMedian1(a, b);
        System.out.println(median);
    }

    private static double findMedian1(int[] a, int[] b) {
        if(b.length < a.length) return findMedian1(b,a);

        int n1 = a.length;
        int n2 = b.length;
        int low = 0;
        int high = n1;

        while(low <= high){
            int cut1 = (low + high) >> 1;
            int cut2 = (n1 + n2 + 1) / 2 - cut1;

            int left1 = cut1 == 0 ? Integer.MIN_VALUE : a[cut1 -1];
            int left2 = cut2 == 0 ? Integer.MIN_VALUE : b[cut2 -1];

            int right1 = cut1 == n1 ? Integer.MAX_VALUE : a[cut1];
            int right2 = cut2 == n2 ? Integer.MAX_VALUE : b[cut2];

            if(left1 <= right1 && left2 <= right2){
                if((n1 + n2) % 2 == 0){
                    return (double)((Math.max(left1, left2) + Math.min(right1, right2))/2.0);
                }else{
                    return Math.max(left1, left2);
                }
            }else if(left1 > right2){
                high = cut1 -1;
            }else{
                low = cut1 +1;
            }
        }
        return 0.0;
    }
}
