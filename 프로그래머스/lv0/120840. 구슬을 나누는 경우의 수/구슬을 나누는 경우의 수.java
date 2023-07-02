class Solution {
    public int solution(int balls, int share) {
        long answer = 1;
        int cnt = balls - share;
        
        int ballsTemp = balls;
        int shareTemp = 1;
        for(int i=0; i<cnt; i++) {
            answer *= ballsTemp--;
            answer /= shareTemp++;
        }
        
        return (int)answer;
    }
}