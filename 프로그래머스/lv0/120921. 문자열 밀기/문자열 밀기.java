import java.util.*;
class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String changedA = A;
        for(int i=0; i<A.length(); i++) {
            if(changedA.equals(B)) {
                return answer;
            }
            String temp = changedA.substring(changedA.length()-1);
            changedA = temp + changedA.substring(0, changedA.length()-1);
            answer++;
        }
        
        return -1;
    }
}