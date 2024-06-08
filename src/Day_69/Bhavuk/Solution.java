package Day_69.Bhavuk;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        //mapping key-element value-index
        hashmap.put(0,-1);
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum+=nums[i];
            int rem = sum%k;
            if(!hashmap.containsKey(rem)){
                hashmap.put(rem,i);
            }
            else if(hashmap.containsKey(rem) && i-hashmap.get(rem)>=2){
                return true;
            }
        }

        return false;
    }

}
