class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0, j = 0;
        StringBuilder r= new StringBuilder();

        while (i < word1.length() && j < word2.length()){
            r.append(word1.charAt(i));
            r.append(word2.charAt(j));
            i++;
            j++;
        }

        r.append(word1.substring(i));
        r.append(word2.substring(j));

        return r.toString();    
    }
}

