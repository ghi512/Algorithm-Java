class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        int len = numlist.length;
        
        int[] temp = new int[len];
        int index = 0;
        for(int i=0; i<len; i++) {
            if(numlist[i]%n == 0) {
                temp[index++] = numlist[i];
            }
        }
        
        answer = new int[index];
        for(int i=0; i<index; i++) {
            answer[i] = temp[i];
        }
        
        return answer;
    }
}