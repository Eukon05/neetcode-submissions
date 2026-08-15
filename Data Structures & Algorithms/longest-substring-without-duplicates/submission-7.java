class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = left;
        int max = 0;

        Set<Character> duplicates = new HashSet<>();
        char[] arr = s.toCharArray();
        while (right < s.length()){
            if(duplicates.contains(arr[right])){
                duplicates.remove(arr[left]);
                left++;
            }
            else {
                duplicates.add(arr[right]);
                right++;
                max = Math.max(max, duplicates.size());
            }
        }

        return max;
    }
}
