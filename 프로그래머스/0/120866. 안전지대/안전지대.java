class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int n = board[0].length;
        int[][] dangerZone = new int[n][n];
        
        // 위험지역 체크
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(board[i][j] == 1) {
                    checkDanger(n, i, j, dangerZone);
                }
            }
        }
        
        // 안전한 지역 수 카운트
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(dangerZone[i][j] == 0) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
    
    void checkDanger(int n, int i, int j, int[][] dangerZone) {
        // [i-1][j-1]   [i-1][j]    [i-1][j+1]
        // [i][j-1]     [i][j]      [i][j+1]
        // [i+1][j-1]   [i+1][j]    [i+1][j+1]
        
        dangerZone[i][j] = 1;
        if(i>0 && j>0) dangerZone[i-1][j-1] = 1; // 왼쪽 위
        if(i>0) dangerZone[i-1][j] = 1; // 위
        if(i>0 && j<n-1) dangerZone[i-1][j+1] = 1; // 오른쪽 위
        if(j>0) dangerZone[i][j-1] = 1; // 왼쪽
        if(j<n-1) dangerZone[i][j+1] = 1; // 오른쪽
        if(i<n-1 && j>0) dangerZone[i+1][j-1] = 1; // 왼쪽 아래
        if(i<n-1) dangerZone[i+1][j] = 1; // 아래
        if(i<n-1 && j<n-1) dangerZone[i+1][j+1] = 1; // 오른쪽 아래
        
    }
}