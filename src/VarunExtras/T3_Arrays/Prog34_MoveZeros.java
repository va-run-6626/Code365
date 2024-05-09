package VarunExtras.T3_Arrays;

import java.util.Arrays;

public class Prog34_MoveZeros {
    public static void main(String[] args) {
        int[] arr= {1,2,0,0,3,4,0,0,7,6};
        System.out.println(Arrays.toString(arr));
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void moveZeroes(int[] nums) {
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != 0){
                nums[i] = nums[j];
                i++;
            }
        }
        for(int k = i; k < nums.length ; k++){
            nums[k] = 0;
        }
    }
}
