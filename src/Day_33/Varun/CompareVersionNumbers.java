package Day_33.Varun;

public class CompareVersionNumbers {
    public static void main(String[] args) {
        String version1 = "0.1";
        String version2 = "1.1";

        int ans = new Solution().compareVersion(version1,version2);
        System.out.println(ans);
    }
    static class Solution {
        public int compareVersion(String version1, String version2) {
            String[] ver1 = version1.split("\\.");
            String[] ver2 = version2.split("\\.");
            for(int i = 0; i < Math.max(ver1.length, ver2.length); i++){
                int num1 = i < ver1.length ? Integer.parseInt(ver1[i]) : 0;
                int num2 = i < ver2.length ? Integer.parseInt(ver2[i]) : 0;
                if(num1 < num2) return -1;
                if(num1 > num2) return 1;
            }
            return 0;
        }
    }
}
