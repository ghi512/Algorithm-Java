class Solution {
    public String solution(String code) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        int len = code.length();
        
        int mode = 0;
        
        for(int i=0; i<len; i++) {
            char c = code.charAt(i);
            if(mode == 0) {
                if(c=='1') {
                    mode = 1;
                }
                else {
                    if(i%2==0) {
                        sb.append(c);
                    }
                }
            }
            else if(mode == 1) {
                if(c=='1') {
                    mode = 0;
                }
                else {
                    if(i%2!=0) {
                        sb.append(c);
                    }
                }                
            }
        }
        
        answer = sb.toString();
        if(answer.isEmpty())
            answer = "EMPTY";
        return answer;
    }
}