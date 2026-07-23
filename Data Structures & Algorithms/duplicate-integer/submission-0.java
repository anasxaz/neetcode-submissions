class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            freq.merge(nums[i],1,Integer::sum);
        }
        for(int f : freq.values()){
            if(f>1) return true;
        }
        return false;

    }
}