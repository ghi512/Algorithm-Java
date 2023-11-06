import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] sortEmergency = emergency.clone();
        Arrays.sort(sortEmergency);
        
        int priority = emergency.length;
        for(int i=0; i<sortEmergency.length; i++) {
            for(int j=0; j<emergency.length; j++) {
                if(sortEmergency[i] == emergency[j]) {
                    answer[j] = priority--;
                    break;
                }
            }
        }
        
        
        return answer;
    }
}