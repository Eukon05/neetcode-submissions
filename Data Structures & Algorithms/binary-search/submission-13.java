class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int p;

        while (l <= r){
            p = l + (r - l) / 2;
            if(nums[p] == target)
                return p;
            else if(nums[p] < target)
                l = p + 1;
            else
                r = p - 1;
        }

        return -1;
    }
}
