class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counter = new HashMap<>();

        for(int num : nums){
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }

        return counter.entrySet().stream()
        .sorted((eOne, eTwo) -> Integer.compare(eTwo.getValue(), eOne.getValue()))
        .limit(k).map(e -> e.getKey()).mapToInt(Integer::intValue).toArray();
        
    }
}
