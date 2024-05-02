package VarunExtras.T4_BinarySearch;

public class Prog69_BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int target = 6;
        System.out.println(bs(nums,target));
    }

    private static int bs(int[] nums, int target) {
        int s = 0;
        int e = nums.length-1;
        while(s <= e){
            int mid = s + (e - s)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                e = mid -1;
            }else{
                s = mid +1;
            }
        }
        return -1;
    }
}
