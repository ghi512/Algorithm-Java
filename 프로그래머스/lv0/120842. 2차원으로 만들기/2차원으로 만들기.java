class Solution {
    public int[][] solution(int[] num_list, int n) {
        int height = num_list.length/n;
        int[][] answer = {};
        answer = new int[height][n]; // [세로크기][가로크기]
        
        int index = 0;
        for(int i=0; i<height; i++) {
            for(int j=0; j<n; j++) {
                answer[i][j] = num_list[index++];
            }
        }
        
        return answer;
    }
}