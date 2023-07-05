class Solution {
    public String solution(String s) {
        String answer = "";
        int[] alphaNum = new int[26];
        
        for(int i=0; i<s.length(); i++) {
            alphaNum[(int)s.charAt(i)-'a']++;
        }
        
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<26; i++) {
            if(alphaNum[i] == 1) {
                sb.append((char)(i+'a'));
            }
        }
        
        answer = sb.toString();
        return answer;
    }
}