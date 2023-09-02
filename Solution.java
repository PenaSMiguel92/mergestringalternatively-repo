public class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int w1l = word1.length();
        int w2l = word2.length();
        String res = "";
        
        while (i < w1l || i < w2l) {
            if (i < w1l)
                res += String.valueOf(word1.charAt(i));

            if (i < w2l)
                res += String.valueOf(word2.charAt(i));
            
            i++;
        }

        return res;
    }
}
