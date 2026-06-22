class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) return 0;

        Set<Character> chars = new HashSet<Character>();

        int i = 0;
        int j = i + 1;
        int currentLength=1;
        int maxLength = 1;

        chars.add(s.charAt(0));

        while(j < s.length() && i < s.length()){
            if(!chars.contains(s.charAt(j))){
                currentLength++;
                chars.add(s.charAt(j));
                j++;

                if(j == s.length()) maxLength = Math.max(maxLength, currentLength);
            }
            else {
                maxLength = Math.max(maxLength, currentLength);
                currentLength--;
                chars.remove(s.charAt(i));
                i++;
            }
        }

        return maxLength;
    }
}
