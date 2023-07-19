class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        sb.append(my_string.substring(0, s));
        sb.append(overwrite_string);
        int overLen = overwrite_string.length();
        sb.append(my_string.substring(s+overLen, my_string.length()));
        
        answer = sb.toString();
        return answer;
    }
}