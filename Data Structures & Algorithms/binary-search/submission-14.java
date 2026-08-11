class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int pivot;
        int current;

        while(left <= right){
            pivot = (right + left) / 2;
            current = nums[pivot];
            if(current == target)
                return pivot;
            else if(current < target){
                left = pivot + 1;
            }
            else {
                right = pivot - 1;
            }
        }

        return -1;
    }
}
