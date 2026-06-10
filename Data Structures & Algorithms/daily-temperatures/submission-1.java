class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> days = new Stack<>();
        int[] out = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++){
            while(!days.isEmpty() && temperatures[i] > temperatures[days.peek()]){
                out[days.peek()] = i - days.peek();
                days.pop();
            }
            days.push(i);
        }

        return out;
    }
}
