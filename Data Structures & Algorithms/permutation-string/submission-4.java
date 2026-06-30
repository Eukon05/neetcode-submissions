class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;

        Map<Character, Integer> ogCounts = new HashMap<>();
        Map<Character, Integer> counts = new HashMap<>();

        int i = 0;
        int j = i + s1.length() - 1;
        char currentStart, currentEnd;

        for(int x = 0; x < s1.length(); x++){
            char ogChar = s1.charAt(x);
            char cmpChar = s2.charAt(x);
            ogCounts.put(ogChar, ogCounts.getOrDefault(ogChar, 0) + 1);
            counts.put(cmpChar, counts.getOrDefault(cmpChar, 0) + 1);
        }

        int zeroCheck;

        while(j < s2.length()){
            if(ogCounts.equals(counts)) return true;
            else {
                zeroCheck = counts.get(s2.charAt(i)) - 1;
                if(zeroCheck == 0){
                    counts.remove(s2.charAt(i));
                }
                else {
                    counts.put(s2.charAt(i), zeroCheck);
                }
                i++;
                j++;
                if(j == s2.length()) break;
                counts.put(s2.charAt(j), counts.getOrDefault(s2.charAt(j), 0) + 1);
            }
        }

        return false;
    }
}
