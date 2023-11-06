import java.lang.Math;
import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int arrLen = array.length;
        
        Arrays.sort(array);
        int diff = n + array[arrLen-1];
        for(int i=0; i<arrLen; i++) {
            if(Math.abs(n-array[i]) <= diff) {
                if(Math.abs(n-array[i]) == diff) {
                    continue;
                }
                diff = Math.abs(n-array[i]);
                answer = array[i];
            }
        }
        
        return answer;
    }
}