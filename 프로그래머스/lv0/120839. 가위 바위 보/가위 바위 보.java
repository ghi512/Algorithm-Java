import java.util.*;
class Solution {
    public String solution(String rsp) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<rsp.length(); i++) {
            char ch = rsp.charAt(i);
            if(ch == '2') {
                sb.append('0');
            }
            else if(ch == '0') {
                sb.append('5');
            }
            else if(ch == '5') {
                sb.append('2');
            }
        }
        
        answer = sb.toString();
        return answer;
    }
}