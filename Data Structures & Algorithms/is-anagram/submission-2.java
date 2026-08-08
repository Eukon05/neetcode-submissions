class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> lettersOne = new HashMap<>();
        Map<Character, Integer> lettersTwo = new HashMap<>();

        if(s.length() != t.length()) return false;

        for(int i = 0; i < s.length(); i++){
            lettersOne.merge(s.charAt(i), 1, (c, n) -> c + n);
            lettersTwo.merge(t.charAt(i), 1, (c, n) -> c + n);
        }

        for(Map.Entry<Character, Integer> en : lettersOne.entrySet()) {
            if(!en.getValue().equals(lettersTwo.getOrDefault(en.getKey(), 0)))
                return false;
        }

        return true;
    }
}
