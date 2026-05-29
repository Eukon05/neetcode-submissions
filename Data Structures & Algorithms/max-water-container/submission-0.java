class Solution {
    public int maxArea(int[] heights) {
        int maxCap = 0;

        int i = 0;
        int j = heights.length - 1;
        int currentCap = 0;

        while(i < j){
            currentCap = (j - i) * Math.min(heights[i], heights[j]);
            maxCap = Math.max(currentCap, maxCap);

            if(heights[i] < heights[j])
                i++;
            else
                j--;
        }

        return maxCap;
    }
}
