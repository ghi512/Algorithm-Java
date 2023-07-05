class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int[] temp = new int[n];
        int index = 0;
        
        for(int i=1; i<=n; i++) {
            if(n%i == 0) {
                temp[index++] = i;
            }
        }
        
        answer = new int[index];
        for(int i=0; i<index; i++) {
            answer[i] = temp[i];
        }
        
        return answer;
    }
}