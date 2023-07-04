class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = {};
        int strLen = strlist.length;
        answer = new int[strLen];
        
        for(int i=0; i<strLen; i++) {
            answer[i] = strlist[i].length();
        }
        
        
        return answer;
    }
}