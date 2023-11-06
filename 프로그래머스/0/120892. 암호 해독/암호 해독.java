class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        int strLen = cipher.length();
        
        for(int i=code-1; i<strLen; i+=code) {
            sb.append(cipher.charAt(i));
        }        
        
        answer = sb.toString();
        return answer;
    }
}