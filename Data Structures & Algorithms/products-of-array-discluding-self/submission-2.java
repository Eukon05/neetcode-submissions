class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroCount = 0;
        int prodAll = nums[0];
        int prodNotZero = nums[0];

        int[] res = new int[nums.length];

        for(int i = 1; i < nums.length; i++){
            prodAll *= nums[i];
            if(nums[i] == 0){
                zeroCount++;
                if(zeroCount > 1) break; else continue;
            }
            prodNotZero *= nums[i];
        }

        if(zeroCount > 1){
            for(int i = 0; i < nums.length; i++)
                res[i] = 0;

            return res;
        }

        for(int i = 0; i < nums.length; i++){
            res[i] = (nums[i] == 0 ? prodNotZero : prodAll / nums[i]);
        }

        return res;
    }
}  
