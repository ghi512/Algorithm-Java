class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        int strLen = my_string.length();
        int sbLen = sb.length();
        
        for(int i=0; i<strLen; i++) {
            int flag = 0;
            sbLen = sb.length();
            for(int j=0; j<sbLen; j++) {
                if(my_string.charAt(i) == sb.charAt(j)) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 1) {
                continue;
            }
            else {
                sb.append(my_string.charAt(i));
            }
        }
        
        answer = sb.toString();
        return answer;
    }
}