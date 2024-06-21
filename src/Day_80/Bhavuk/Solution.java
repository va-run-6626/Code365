class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        //using khandani sliding window template
        int n = customers.length;
        int current_Unstatisfied = 0;
        //for first window
        for(int i = 0; i<minutes; i++){
            current_Unstatisfied += customers[i]*grumpy[i];
        }
        int max_Unstatisfied = current_Unstatisfied;

        int i = 0;
        int j = minutes;
        while(j<n){
            current_Unstatisfied += customers[j]*grumpy[j]; //new element in the window
            current_Unstatisfied -= customers[i]*grumpy[i]; // removing element from the window


            max_Unstatisfied = Math.max(max_Unstatisfied,current_Unstatisfied);

            i++;
            j++;
        }

        int total_Unsatisfied = max_Unstatisfied;
        for(int k = 0; k<n; k++){
            total_Unsatisfied += customers[k]*(1-grumpy[k]); // only 0's
        }
        return total_Unsatisfied;

    }
}