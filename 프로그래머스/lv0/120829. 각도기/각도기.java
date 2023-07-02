class Solution {
    public int solution(int angle) {
        int answer = 0;
        answer = checkAngle(angle);
        return answer;
    }
    
    int checkAngle(int n) {
        int answer = 0;
        if(n>0 && n<90) {
            answer = 1;
        }
        else if(n == 90) {
            answer = 2;
        }
        else if(n>90 && n<180) {
            answer = 3;
        }
        else if(n == 180) {
            answer = 4;
        }
        return answer;
    }
}