package VarunExtras.T4_BinarySearch;

public class Prog79_RotationCount {
    public static void main(String[] args) {
        int[] arr = {2,5,6,0,0,1,2};
        System.out.println(findKRotation(arr));
    }
    public static int findKRotation(int []arr){
        int p = pivot(arr);
        if(p == -1)return 0;
        else return p+1;
    }
    private static int pivot(int[] arr){
        int s = 0;
        int e = arr.length-1;
        while(s <= e){
            int m = s + (e - s)/2;
            if(m < e && arr[m] > arr[m+1]) return m;
            if(m > s && arr[m] < arr[m-1]) return m-1;
            if(arr[s] >= arr[m]){
                e = m-1;
            }else{
                s = m+1;
            }
        }
        return -1;
    }
}
