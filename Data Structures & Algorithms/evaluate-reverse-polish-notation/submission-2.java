class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> nums = new Stack<>();
        int right, left;
        char c;

        for(int i = 0; i < tokens.length; i++){
            switch (tokens[i]){
                case "+": {
                    right = nums.pop();
                    left = nums.pop();
                    nums.push(left + right);
                    break;
                }
                case "-": {
                    right = nums.pop();
                    left = nums.pop();
                    nums.push(left - right);
                    break;
                }
                case "*": {
                    right = nums.pop();
                    left = nums.pop();
                    nums.push(left * right);
                    break;
                }
                case "/": {
                    right = nums.pop();
                    left = nums.pop();
                    nums.push(left / right);
                    break;
                }
                default: {
                    nums.push(Integer.parseInt(tokens[i]));
                }
            }
        }

        return nums.pop();

    }
}
