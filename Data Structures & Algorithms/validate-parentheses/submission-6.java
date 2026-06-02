class Solution {
    Map<Character, Character> cto = new HashMap<>();

    Solution(){
        cto.put('}', '{');
        cto.put(']', '[');
        cto.put(')', '(');
    }

    public boolean isValid(String s) {
        if(s.length() % 2 != 0)
            return false;

        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray())
            if(cto.containsKey(c)){
                if(st.isEmpty())
                    return false;
                else if(!cto.get(c).equals(st.pop()))
                    return false;
            }
            else st.push(c);

        return st.isEmpty();
    }
}
