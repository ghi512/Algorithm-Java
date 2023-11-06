class Solution {
    public String solution(int age) {
        String answer = "";
        
        String strAge = Integer.toString(age);
        int[] arrAge = new int[strAge.length()];
        for(int i=0; i<strAge.length(); i++) {
            arrAge[i] = strAge.charAt(i) - '0';
        }
        
        char[] alpha = new char[10];
        char ch = 'a';
        for(int j=0; j<10; j++) {
            alpha[j] = ch++;
        }
        
        StringBuffer sb = new StringBuffer();
        for(int k=0; k<arrAge.length; k++) {
            sb.append(alpha[arrAge[k]]);
        }
        
        answer = sb.toString();        
        return answer;
    }
}