import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);
        int strLen = str.length();
        
        for(int i=0; i<strLen; i++) {
            answer += str.charAt(i) - '0';
        }
        
        return answer;
    }
}