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

    private int binarySearch(int[] nums, int left, int right, int target){
        int pivot = -1;

        while(left <= right){
            pivot = (left + right) / 2;

            if(nums[pivot] == target)
                return pivot;
            else if(nums[pivot] < target){
                left = pivot + 1;
            }
            else {
                right = pivot - 1;
            }
        }

        return -1;
    }

    public int search(int[] nums, int target) {
        if(nums.length == 0)
            return -1;

        int rotationPoint = findPivot(nums);

        if(rotationPoint == -1){
            return binarySearch(nums, 0, nums.length - 1, target);
        }
        else if(target >= nums[0]){
            return binarySearch(nums, 0, rotationPoint, target);
        }
        else{
            return binarySearch(nums, rotationPoint + 1, nums.length - 1, target);
        }
    }
}
