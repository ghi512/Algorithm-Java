import java.lang.*;
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int width = 0;
        int height = 0;
        
        // 가로길이
        for(int i=1; i<=2; i++) {
            if(dots[0][0] == dots[i][0])
                continue;
            else
                width = Math.abs(dots[0][0] - dots[i][0]);
        }
        
        // 세로길이
        for(int i=1; i<=2; i++) {
            if(dots[0][1] == dots[i][1])
                continue;
            else
                height = Math.abs(dots[0][1] - dots[i][1]);
        }
        
        answer = width * height;
        return answer;
    }
}