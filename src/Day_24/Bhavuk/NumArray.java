package Day_24.Bhavuk;

public class NumArray {
    int sum = 0;
    int nums[];

    public NumArray(int[] nums) {
        this.nums = nums;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
    }

    public void update(int index, int val) {
        sum = sum - nums[index] + val;
        nums[index] = val;
    }

    public int sumRange(int left, int right) {
        int tempSum = sum;
        for (int i = 0; i < left; i++) {
            tempSum -= nums[i];
        }
        for (int i = nums.length - 1; i > right; i--) {
            tempSum -= nums[i];
        }
        return tempSum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9, 11};
        NumArray obj = new NumArray(nums);

        System.out.println("Initial sum of the array: " + obj.sum);

        obj.update(2, 6); // Update index 2 with value 6

        System.out.println("Sum after updating index 2 with value 6: " + obj.sum);

        int left = 1;
        int right = 4;
        System.out.println("Sum range between indices " + left + " and " + right + ": " + obj.sumRange(left, right));
    }
}
