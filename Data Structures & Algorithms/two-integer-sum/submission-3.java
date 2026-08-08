class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> counts = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            counts.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(counts.containsKey(diff)){
                int j = counts.get(diff);
                if(i == j) continue;
                return new int[]{Math.min(i, j), Math.max(i, j)};
            }
        }

        return new int[]{-1, -1};
    }
}
