import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        StringBuffer sb = new StringBuffer();
        int strLen = my_string.length();
        for(int i=0; i<strLen; i++) {
            char ch = my_string.charAt(i);
            if(ch >= '0' && ch <= '9') {
                sb.append(ch);
            }
        }
        
        strLen = sb.length();
        answer = new int[strLen];
        for(int j=0; j<strLen; j++) {
            answer[j] = sb.charAt(j) - '0';
        }
        Arrays.sort(answer);
        return answer;
    }
}