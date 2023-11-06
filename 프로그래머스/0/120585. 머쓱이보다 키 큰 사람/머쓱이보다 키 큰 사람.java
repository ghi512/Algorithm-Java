import java.util.*;
class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        int arrLen = array.length;
        for(int i=0; i<arrLen; i++) {
            if(array[i] > height) {
                answer++;
            }
        }
        
        return answer;
    }
}