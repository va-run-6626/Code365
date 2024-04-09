package Day_9.Varun;

public class TimeNeededToBuyTickets {
    public static void main(String[] args) {
        int[] tickets = {5,1,1,1};
        int k = 0;
        int time = timeTaken(tickets, k);
        System.out.println(time);
    }

    private static int timeTaken(int[] tickets, int k) {
        int time = 0;
        int i = 0;
        while(tickets[k] > 0){
            if( i < tickets.length && tickets[i] != 0){
                tickets[i]--;
                i++;
                time++;
            }else if(i == tickets.length){
                i = 0;
            }else{
                i++;
            }
        }
        return time;
    }
}
