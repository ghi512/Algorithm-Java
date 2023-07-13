import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        List<Integer> scoreSumList = new ArrayList<>();
        for(int[] student : score) {
            scoreSumList.add(student[0] + student[1]);
        }
        scoreSumList.sort(Comparator.reverseOrder());
        
        int[] answer = new int[score.length];
        for(int i=0; i<score.length; i++) {
            answer[i] = scoreSumList.indexOf(score[i][0] + score[i][1]) + 1;
        }
        
        return answer;
    }
}