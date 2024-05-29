package Day_58.Bhavuk;

class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();  // length of the strings
        int res = 0;         // result to store the maximum length
        int win = 0;         // variable to store the current total cost
        int l = 0;           // left pointer of the sliding window

        // Iterate through the string with the right pointer r
        for(int r = 0; r < n; r++) {
            // Add the transformation cost for the current character
            win += Math.abs(s.charAt(r) - t.charAt(r));

            // If the current cost exceeds maxCost, adjust the left pointer
            while(win > maxCost) {
                win -= Math.abs(s.charAt(l) - t.charAt(l));
                l++;
            }

            // Update the result with the maximum length found
            res = Math.max(res, r - l + 1);
        }
        return res;  // Return the result
    }
}