class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int stringLen = my_string.length();
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<stringLen; i++) {
            for(int j=0; j<n; j++) {
                sb.append(my_string.charAt(i));
            }
        }
        answer = sb.toString();
        return answer;
    }
}