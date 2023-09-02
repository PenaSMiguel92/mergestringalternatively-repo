public class Solution {
    public String mergeAlternately(String word1, String word2) {
        int left = 0;
        int right = 0;
        boolean alt = false; //false - increment left, true - increment right;
        String res = "";
        
        while (left < word1.length() || right < word2.length()) {
            if (!alt && left < word1.length())
                res += word1.charAt(left++);

            if (alt && right < word2.length())
                res += word2.charAt(right++);
            
            alt = !alt;
        }
        
        return res;
    }
}
