import java.lang.*;
class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        
        for(String s: keyinput) {
            if(s.equals("up")) {
                answer[1]++;
            }
            else if(s.equals("down")) {
                answer[1]--;
            }
            else if(s.equals("left")) {
                answer[0]--;
            }
            else if(s.equals("right")) {
                answer[0]++;
            }
            
            answer = checkBoard(answer, board);
        }
        
        return answer;
    }
    
    int[] checkBoard(int[] ans, int[] board) {
        if(ans[0] > board[0]/2) {
            ans[0]--;
        }
        else if(ans[0] < -(board[0]/2)) {
            ans[0]++;
        }
        if(ans[1] > board[1]/2) {
            ans[1]--;
        }
        else if(ans[1] < -(board[1]/2)) {
            ans[1]++;
        }
        return ans;
    }
}