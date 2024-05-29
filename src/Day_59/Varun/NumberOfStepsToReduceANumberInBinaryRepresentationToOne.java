package Day_59.Varun;

public class NumberOfStepsToReduceANumberInBinaryRepresentationToOne {
    public static void main(String[] args) {
        String s = "1101";
        int cnt = new Solution().numSteps(s);
        System.out.println(cnt);
    }
}
class Solution{
    public int numSteps(String s){
        int cnt = 0;
        int cary = 0;

        for(int i = s.length()-1; i >= 0; i--){
            int num = s.charAt(i) - '0';
            if(num == 0 && cary == 0){
                cnt++;
            }else if(num == 1 && cary == 1){
                cnt++;
                cary = 1;
            }else{
                cnt += 2;
                cary = 1;
            }
        }
        if(cary == 1) cnt++;
        return cnt;
    }
}