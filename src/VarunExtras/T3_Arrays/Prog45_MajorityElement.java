package VarunExtras.T3_Arrays;

public class Prog45_MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }

    private static int majorityElement(int[] nums) {
        int vote = 1;
        int num = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(num == nums[i]){
                vote++;
            }else if(num != nums[i] && vote == 0){
                num = nums[i];
                vote = 1;
            }else{
                vote--;
            }
        }
        return num;
    }
}
