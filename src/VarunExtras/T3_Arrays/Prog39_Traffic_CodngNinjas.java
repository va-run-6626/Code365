package VarunExtras.T3_Arrays;

public class Prog39_Traffic_CodngNinjas {
    public static void main(String[] args) {
        int[] arr = {0,1,0,0,1,0};
        int m = 3;
        System.out.println(traffic(arr.length,m,arr));
    }
    public static int traffic(int n, int m, int []vehicle) {
        int right = 0, count = 0, answer = 0;
        for(int left = 0; left < n; left++){
            while(right < n && count <= m){
                if(vehicle[right] == 0){
                    count++;
                    if(count > m){
                        count--;
                        break;
                    }
                }
                right++;
            }
            answer = Math.max(right - left,answer);
            if(vehicle[left] == 0)count--;
        }
        return answer;
    }
}
