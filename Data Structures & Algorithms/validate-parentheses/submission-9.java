class Solution {
    private final Map<Character, Character> closingToOpeningMap = new HashMap<>();

    Solution(){
        closingToOpeningMap.put('}', '{');
        closingToOpeningMap.put(')', '(');
        closingToOpeningMap.put(']', '[');
    }

    public boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;

        Deque<Character> openingStack = new ArrayDeque<>();

        for(char bracket : s.toCharArray()){
            if(closingToOpeningMap.containsKey(bracket)){
                if(openingStack.isEmpty())
                    return false;
                
                char matching = closingToOpeningMap.get(bracket);
                char fromStack = openingStack.pop();

                if(matching != fromStack)
                    return false;
            }
            else {
                openingStack.push(bracket);
            }
        }

        return openingStack.isEmpty();
    }
}
