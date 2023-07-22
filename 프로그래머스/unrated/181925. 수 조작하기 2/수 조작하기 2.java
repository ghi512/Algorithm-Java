class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<numLog.length; i++) {
            int diff = numLog[i] - numLog[i-1];
            if(diff == 1) sb.append("w");
            if(diff == -1) sb.append("s");
            if(diff == 10) sb.append("d");
            if(diff == -10) sb.append("a");
        }
        String answer = sb.toString();
        return answer;
    }
}