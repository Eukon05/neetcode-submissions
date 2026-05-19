class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for(String s : strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            anagrams.putIfAbsent(sorted, new ArrayList<>());
            anagrams.get(sorted).add(s);
        }

        return new ArrayList(anagrams.values());
    }
}
