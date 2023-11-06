import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        int strLen = my_string.length();
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<strLen; i++) {
            char ch = my_string.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                continue;
            }
            sb.append(ch);
        }
        answer = sb.toString();
        return answer;
    }
}