package Day_12.Varun;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] heights = {0,1,0,2,1,0,1,3,2,1,2,1};
        int maxWater = find(heights);
        System.out.println(maxWater);
    }

    private static int find(int[] heights) {
        if (heights.length == 0) {
            return 0;
        }
        int l = 0;
        int r = heights.length - 1;
        int lMax = heights[l];
        int rMax = heights[r];
        int res = 0;
        while (l < r) {
            if (lMax < rMax) {
                l++;
                lMax = Math.max(lMax, heights[l]);
                res += lMax - heights[l];
            } else {
                r--;
                rMax = Math.max(rMax, heights[r]);
                res += rMax - heights[r];
            }
        }
        return res;
    }
}
