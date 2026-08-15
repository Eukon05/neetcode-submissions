class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();

        for(int x : nums){
            counts.merge(x, 1, Integer::sum);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((o, t) -> Integer.compare(o.getValue(), t.getValue()));

        for(Map.Entry<Integer, Integer> e : counts.entrySet()){
            queue.add(e);
            if(queue.size() > k)
                queue.poll();
        }

        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = queue.poll().getKey();
        }

        return res;
    }
}
