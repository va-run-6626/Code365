package Day_23.Bhavuk;
import java.util.*;
public class FurthestBuilding {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] heights = {4, 2, 7, 6, 9, 14, 12};
        int bricks = 5;
        int ladders = 1;
        int result = solution.furthestBuilding(heights, bricks, ladders);
        System.out.println("The furthest building that can be reached is at index: " + result);
    }
}
class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> bricksUsed = new PriorityQueue<>(Collections.reverseOrder());
        int i = 0;
        for (i = 0; i < heights.length - 1; i++) {
            if (heights[i + 1] <= heights[i])
                continue;

            int diff = heights[i + 1] - heights[i];

            if (diff <= bricks) {
                bricks -= diff;
                bricksUsed.add(diff);
            } else if (ladders > 0) {
                if (!bricksUsed.isEmpty() && bricksUsed.peek() > diff) {
                    bricks += (bricksUsed.remove() - diff);
                    bricksUsed.add(diff);
                }
                ladders--;
            } else
                break;
        }
        return i;
    }
}
