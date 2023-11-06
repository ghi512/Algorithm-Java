class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] strToChar = my_string.toCharArray();
        StringBuffer sb = new StringBuffer();
        
        for(char c: strToChar) {
            if(c < '0' || c > '9') { // 숫자가 아닌 경우
                sb.append(" ");
                continue;
            }
            else {
                sb.append(c);
            }
        }
        
        String[] numList = sb.toString().split(" ");
        
        
        for(String s: numList) {
            if(s.equals(" ") || s.equals("")) {
                continue;
            }
            answer += Integer.parseInt(s);
        }
        
        return answer;
    }
}