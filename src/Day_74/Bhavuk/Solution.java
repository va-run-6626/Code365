package Day_74.Bhavuk;
import java.util.*;
class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int res = 0;
        for(int i = seats.length-1; i>=0; i--){
            res+=Math.abs(students[i]-seats[i]);
        }

        return res;
    }
}