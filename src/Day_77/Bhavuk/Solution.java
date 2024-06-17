package Day_77.Bhavuk;

class Solution {
    public boolean judgeSquareSum(int c) {
        if(c<0)return false;
        long i = 0;
        long j = (int)Math.sqrt(c);
        long sum = 0;
        while(i<=j){
            sum = i*i + j*j;
            if(sum == c) return true;

            if(sum<c){
                i++;
            }
            else{
                j--;
            }
        }
        return false;

    }
}