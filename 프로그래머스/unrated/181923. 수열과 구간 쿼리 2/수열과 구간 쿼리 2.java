import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i=0; i<queries.length; i++) {
            answer[i] = -1;
            int[] tempArr = Arrays.copyOfRange(arr, queries[i][0], queries[i][1]+1);
            Arrays.sort(tempArr);
            for(int j=0; j<tempArr.length; j++) {
                if(tempArr[j] > queries[i][2]) {
                    answer[i] = tempArr[j];
                    break;
                }
            }
        }
        
        return answer;
    }
}