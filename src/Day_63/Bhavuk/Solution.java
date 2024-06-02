package Day_63.Bhavuk;

class Solution {
    public void reverseString(char[] s) {
        // Initialize two pointers
        for (int i = 0, j = s.length - 1; i <= j; i++, j--) {
            // Swap the elements at the two pointers
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}