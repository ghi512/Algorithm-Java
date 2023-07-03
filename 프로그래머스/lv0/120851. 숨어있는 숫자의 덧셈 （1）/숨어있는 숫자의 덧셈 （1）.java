class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int strLen = my_string.length();
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<strLen; i++) {
            char c = my_string.charAt(i);
            if(c >= '0' && c <= '9') {
                sb.append(c);
            }
        }
        strLen = sb.length();
        for(int i=0; i<strLen; i++) {
            answer += sb.charAt(i) - '0';
        }
        
        return answer;
    }
}