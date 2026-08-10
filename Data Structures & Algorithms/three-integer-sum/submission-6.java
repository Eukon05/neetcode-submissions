class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        int left, right;
        int target;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0)
                break;

            if(i > 0 && nums[i-1] == nums[i])
                continue;
            
            target = -nums[i];
            left = i+1;
            right = nums.length-1;

            while(left < right){
            int sum = nums[left] + nums[right];
                if(sum == target){
                    result.add(List.of(nums[i], nums[left], nums[right]));

                    left++;
                    right--;
                    while(left < nums.length && nums[left-1] == nums[left])
                        left++;
                }
                else if(sum < target)
                    left++;
                else
                    right--;
            }
        }

        return result;
    }
}
