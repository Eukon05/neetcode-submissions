class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder alpha = new StringBuilder();

        for(char c : s.toCharArray())
            if(Character.isLetterOrDigit(c))
                alpha.append(c);

        return alpha.toString().equals(alpha.reverse().toString());
    }
}
