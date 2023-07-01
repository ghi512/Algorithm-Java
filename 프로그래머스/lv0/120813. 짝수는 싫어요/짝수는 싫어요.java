class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        answer = new int[(n+1)/2];
        int k=0;
        for(int i=1; i<=n; i+=2) {
            answer[k++] = i;
        }
        
        return answer;
    }
}