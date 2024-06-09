package Day_70.Bhavuk;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        int result = 0;
        int sum = 0;
        hashmap.put(0,1);
        for(int i = 0; i<nums.length; i++){
            sum+=nums[i];
            int rem = sum%k;
            if(rem<0) rem+=k;
            if(hashmap.containsKey(rem)){
                result+=hashmap.get(rem);
            }
            hashmap.put(rem,hashmap.getOrDefault(rem,0)+1);
        }
        return result;

    }
}