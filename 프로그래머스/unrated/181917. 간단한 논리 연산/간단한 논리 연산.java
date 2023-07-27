class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        
        boolean temp1 = x1 || x2;
        boolean temp2 = x3 || x4;
        answer = temp1 && temp2;
        
        return answer;
    }
}