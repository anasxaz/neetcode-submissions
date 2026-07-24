class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> seen = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if(seen.containsKey(complement)){
                int j = seen.get(complement);
                return new int[]{j,i};
            }
            seen.put(nums[i], i);
        }
        return new int[0];

    }
        
}
