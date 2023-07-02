class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        char ch = letter.charAt(0);
        StringBuffer sb = new StringBuffer();
        int strLen = my_string.length();
        for(int i=0; i<strLen; i++) {
            if(my_string.charAt(i) == ch) {
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