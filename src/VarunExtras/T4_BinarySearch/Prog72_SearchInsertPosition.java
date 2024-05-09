package VarunExtras.T4_BinarySearch;

public class Prog72_SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7};
        int target = 6;
        System.out.println(findPos(arr,target));
    }

    private static int findPos(int[] nums, int target) {
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
        return s;
    }

}
