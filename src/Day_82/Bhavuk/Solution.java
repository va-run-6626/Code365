package Day_82.Bhavuk;

class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int n = nums.length;

        int flips = 0;
        boolean[] isFlipped = new boolean[n];
        int flipCounti = 0;

        for (int i = 0; i < n; i++) {
            if (i >= k && isFlipped[i - k]) {
                flipCounti--;
            }

            if (flipCounti % 2 == nums[i]) {
                if (i + k > n) {
                    return -1;
                }
                flipCounti++;
                isFlipped[i] = true;
                flips++;
            }
        }

        return flips;

    }
}