class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        answer[0] = array[0];
        answer[1] = 0;
        
        int len = array.length;
        for(int i=1; i<len; i++) {
            if(answer[0] < array[i]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        
        return answer;
    }
}