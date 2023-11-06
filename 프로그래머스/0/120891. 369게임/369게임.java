import java.util.*;
class Solution {
    public int solution(int order) {
        int answer = 0;
        String orderStr = Integer.toString(order);
        int strLen = orderStr.length();
        
        for(int i=0; i<strLen; i++) {
            char ch = orderStr.charAt(i);
            if(ch == '3' || ch == '6' || ch == '9') {
                answer++;
            }
        }
        
        return answer;
    }
}