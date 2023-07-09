import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        char[] beforeChar = before.toCharArray();
        char[] afterChar = after.toCharArray();
        int len = beforeChar.length;
        
        Arrays.sort(beforeChar);
        Arrays.sort(afterChar);
        
        for(int i=0; i<len; i++) {
            if(beforeChar[i] == afterChar[i]) {
                continue;
            }
            else {
                answer = 0;
                break;
            }
        }
        
        return answer;
    }
}