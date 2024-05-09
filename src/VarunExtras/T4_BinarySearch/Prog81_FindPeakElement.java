package VarunExtras.T4_BinarySearch;

public class Prog81_FindPeakElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1,4,5,6,7,8,5,4};
        int num = findPeekElement(arr);
        System.out.println(num);
    }

    private static int findPeekElement(int[] nums) {
        int s = 0;
        int e = nums.length -1;
        while(s <= e){
            int mid = s +(e - s)/2;
            if(s == e) return s;
            else if(nums[mid] > nums[mid+1]) e = mid;
            else s = mid +1;
        }
        return -1;
    }
}
