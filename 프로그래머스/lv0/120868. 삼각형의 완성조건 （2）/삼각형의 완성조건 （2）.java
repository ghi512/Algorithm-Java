class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        int smallN = sides[0];
        int bigN = sides[1];
        if(sides[0] > sides[1]) {
            smallN = sides[1];
            bigN = sides[0];
        }
        
        // 가장 긴 변이 bigN인 경우
        answer += bigN - (bigN-smallN) - 1;
        
        // 가장 긴 변이 나머지 한 변인 경우
        answer += (bigN+smallN) - bigN;
        
        return answer;
    }
}