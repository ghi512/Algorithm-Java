class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        int len = my_str.length();
        int loop = (len%n == 0) ? len/n : len/n+1;
        
        answer = new String[loop];
        int index = 0;

        int i = 0;
        for(i=0; i<loop-1; i++) {
            answer[i] = my_str.substring(index, index+n);
            index += n;
        }
        
        answer[i] = my_str.substring(index, len);
        
        return answer;
    }
}