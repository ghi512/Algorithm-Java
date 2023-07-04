class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int arrLen = array.length;
        
        for(int i=0; i<arrLen; i++) {
            if(array[i] == n) {
                answer++;
            }
        }
        
        return answer;
    }
}