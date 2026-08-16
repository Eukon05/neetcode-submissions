class Solution {
    private int findPivot(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        int pivot = -1;

        int rotationPoint = -1;

        while(left < right){
            pivot = (left + right) / 2;
            if(nums[pivot] > nums[pivot + 1]){
                rotationPoint = pivot;
                break;
            }
            else if (nums[pivot] >= nums[left]){
                left = pivot + 1;
            }
            else {
                right = pivot;
            }
        }

        return rotationPoint;
    }

    public int findMin(int[] nums) {
        if(nums.length == 1)
            return nums[0];

        int pivot = findPivot(nums);
        return nums[pivot + 1];
    }
}
