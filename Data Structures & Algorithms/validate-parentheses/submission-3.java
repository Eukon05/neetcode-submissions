class Solution {
    private char getOpposing(char c){
        return switch(c) {
            case ')' -> '(';
            case '(' -> ')';
            case '{' -> '}';
            case '}' -> '{';
            case '[' -> ']';
            case ']' -> '[';
            default -> '.';
        };
    }

    private boolean isOpening(char c){
        return switch (c){
            case ')', '}', ']' -> false;
            default -> true;
        };
    }

    public boolean isValid(String s) {
        if(s.length() % 2 != 0)
            return false;

        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray())
            if(isOpening(c))
                st.push(c);
            else {
                if(st.isEmpty())
                    return false;
                else if(getOpposing(st.pop()) != c)
                    return false;
            }

        if(!st.isEmpty())
            return false;

        return true;
    }
}
