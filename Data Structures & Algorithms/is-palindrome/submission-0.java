class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder alpha = new StringBuilder();

        for(char c : s.toCharArray())
            if(Character.isLetterOrDigit(c))
                alpha.append(c);

        String check = alpha.toString();
        int i = 0;
        int j = check.length() - 1;

        while(i < j){
            if(check.charAt(i) != check.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }
}
