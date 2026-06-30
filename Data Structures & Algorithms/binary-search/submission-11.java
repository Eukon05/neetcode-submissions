class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int p;

        if(nums.length == 1) return nums[0] == target ? 0 : -1;

        while (l <= r){
            if(nums[l] == target) return l;
            if(nums[r] == target) return r;

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
