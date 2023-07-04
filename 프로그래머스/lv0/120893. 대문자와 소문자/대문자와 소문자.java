class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        int strLen = my_string.length();
        
        for(int i=0; i<strLen; i++) {
            char ch = my_string.charAt(i);
            if(ch>='A' && ch<='Z') {
                sb.append((char)(ch+32));
            }
            else if(ch>='a' && ch<='z') {
                sb.append((char)(ch-32));
            }
        }
        
        
        answer = sb.toString();
        return answer;
    }
}