class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
            return 0;

        Arrays.sort(nums);

        int currentCount = 1;
        int maxCount = 0;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1] + 1)
                currentCount++;
            else if(nums[i] == nums[i-1])
                continue;
            else{
                maxCount = Math.max(maxCount, currentCount);
                currentCount = 1;
            }
        }

        maxCount = Math.max(maxCount, currentCount);

        return maxCount;
    }
}
