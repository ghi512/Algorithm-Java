import java.lang.*;
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        if(getDiagonal(dots[0], dots[1]) == getDiagonal(dots[2], dots[3]))
            return 1;
        if(getDiagonal(dots[0], dots[2]) == getDiagonal(dots[1], dots[3]))
            return 1;
        if(getDiagonal(dots[0], dots[3]) == getDiagonal(dots[1], dots[2]))
            return 1;
        
        return answer;
    }
    
    double getDiagonal(int[] dot1, int[] dot2) {
        double doubleDiagonal = 0;
        int x = Math.abs(dot1[0] - dot2[0]);
        int y = Math.abs(dot1[1] - dot2[1]);
        doubleDiagonal = (double)y/x;
        return doubleDiagonal;
    }
}