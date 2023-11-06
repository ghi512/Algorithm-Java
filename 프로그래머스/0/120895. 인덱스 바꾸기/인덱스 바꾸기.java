class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] strToCharArr = my_string.toCharArray();
        char temp = strToCharArr[num1];
        strToCharArr[num1] = strToCharArr[num2];
        strToCharArr[num2] = temp;
        
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<strToCharArr.length; i++) {
            sb.append(strToCharArr[i]);
        }
        
        answer = sb.toString();
        return answer;
    }
}