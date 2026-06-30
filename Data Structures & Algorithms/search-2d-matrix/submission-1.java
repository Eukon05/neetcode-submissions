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

    public boolean searchMatrix(int[][] matrix, int target) {
        int ROWS = matrix.length;
        int COLS = matrix[0].length;

        int l = 0;
        int r = ROWS-1;
        int p = 0;

        while (l <= r){
            p = (l + r) / 2;
            if(target > matrix[p][COLS-1]){
                l = p + 1;
            }
            else if(target < matrix[p][0]){
                r = p - 1;
            }
            else 
                break;
        }

        if(!(l <= r))
            return false;

        p = (l + r) / 2;
        return search(matrix[p], target) != -1;
    }
}
