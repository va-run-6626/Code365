package Day_34.Varun;
import java.util.*;
public class BoatsToSavePeople {
    public static void main(String[] args) {
        int[] people = {3,2,2,1};
        int limit = 3;
        int minBoats = new Solution().numRescueBoats(people,limit);
    }
    static class Solution {
        public int numRescueBoats(int[] people, int limit) {
            Arrays.sort(people);
            int left = 0;
            int right = people.length - 1;
            int boatsCount = 0;
            while (left <= right) {
                if (people[left] + people[right] <= limit) {
                    boatsCount++;
                    left++;
                    right--;
                }
                else if (people[right] <= limit) {
                    boatsCount++;
                    right--;
                }
            }
            return boatsCount;
        }
    }
}
