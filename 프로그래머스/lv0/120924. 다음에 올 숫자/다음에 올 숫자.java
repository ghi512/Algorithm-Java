class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int len = common.length;
        
        int sub1 = common[len-2] - common[len-3];
        int sub2 = common[len-1] - common[len-2];
        
        if(sub1 == sub2) {
            answer = common[len-1] + sub1;
        }
        else {
            int division = common[len-1] / common[len-2];
            answer = common[len-1] * division;
        }
        
        return answer;
    }
}