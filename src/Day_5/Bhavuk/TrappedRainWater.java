package Day_5.Bhavuk;

public class TrappedRainWater {
    public static void main(String[] args) {
        // Heights of the blocks
        int[] height = {4, 2, 0, 3, 2, 5};

        // Calculate the trapped water using the Solution class
        int ans = new Solution().trap(height);
        System.out.println("Trapped Water: " + ans + " Units");
    }
}

class Solution {
    public int trap(int[] height) {
        // Size of the array
        int size = height.length;

        // Array to store the maximum height of bars to the left of the current bar
        int[] maxL = new int[size];
        maxL[0] = height[0];

        // Calculate the maximum height of bars to the left of the current bar
        for (int i = 1; i < size; i++) {
            maxL[i] = Math.max(maxL[i - 1], height[i]);
        }

        // Array to store the maximum height of bars to the right of the current bar
        int[] maxR = new int[size];
        maxR[size - 1] = height[size - 1];

        // Calculate the maximum height of bars to the right of the current bar
        for (int i = size - 2; i >= 0; i--) {
            maxR[i] = Math.max(maxR[i + 1], height[i]);
        }

        // Array to store the amount of water trapped at each index
        int[] water = new int[size];

        // Calculate the amount of water trapped at each index
        for (int i = 0; i < size; i++) {
            water[i] = Math.min(maxL[i], maxR[i]) - height[i];
        }

        // Calculate the total amount of trapped water
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += water[i];
        }

        return sum;
    }
}
