package Day_4;

public class Main {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int maxArea = new Solution().maxArea(height);
        System.out.println("Max-Area - " + maxArea);
    }
}
class Solution {
    public int maxArea(int[] height) {
        int ar=0;
        int i = 0;
        int n = height.length;
        int j = n-1;
        int max=0;
        while(j>i)
        {
            ar = Math.min(height[i],height[j]) * (j-i);
            max = Math.max(ar,max);
            if( height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return max;
    }
}
