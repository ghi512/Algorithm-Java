class Solution {
    public int[] solution(int num, int total) {
        int[] answer = {};
        answer = new int[num];
        
        if(num%2 == 0) {
            for(int i=0; i<num/2-1; i++) {
                answer[i] = total/num - (num/2-1-i);
            }
            answer[num/2-1] = total/num;
            for(int i=num/2; i<num; i++) {
                answer[i] = total/num + (i-(num/2-1));
            }
        }
        else {
            for(int i=0; i<num/2; i++) {
                answer[i] = total/num - (num/2-i);
            }
            answer[num/2] = total/num;
            for(int i=num/2+1; i<num; i++) {
                answer[i] = total/num + (i-num/2);
            }
        }
        
        return answer;
    }
}