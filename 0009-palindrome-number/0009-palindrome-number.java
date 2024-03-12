import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
    
        for (int i = 0, j = str.length()-1; i < str.length() && j >= 0; i++, j--) {
            
            String leftDigit = "" + str.charAt(i);
            String rightDigit = "" + str.charAt(j);
            
            if (str.charAt(i) == '-') {
                i++;
                leftDigit += str.charAt(i);
            }
            if (str.charAt(j) == '-') {
                j--;
                rightDigit += str.charAt(j);
            }
            
            if (!leftDigit.equals(rightDigit)) {
                return false;
            }
        }
        
        return true;
        
    }
}