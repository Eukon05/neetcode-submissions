class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> ogCount = new HashMap<>();
        Map<Character, Integer> counts = new HashMap<>();

        for(Character c : s1.toCharArray()){
            ogCount.put(c, ogCount.getOrDefault(c, 0) + 1);
        }

        for(int i = 0; i + s1.length() <= s2.length(); i++){
            counts.clear();
            for(Character c : s2.substring(i, i+s1.length()).toCharArray()){
                counts.put(c, counts.getOrDefault(c, 0) + 1);
            }
            if(ogCount.equals(counts)) return true;
        }

        return false;
    }
}
