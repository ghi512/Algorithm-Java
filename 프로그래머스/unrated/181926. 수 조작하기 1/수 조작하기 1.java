class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        char[] controlArr = control.toCharArray();
        
        int w_num = 0;
        int s_num = 0;
        int d_num = 0;
        int a_num = 0;
        for(char c: controlArr) {
            if(c == 'w') w_num++;
            else if(c == 's') s_num++;
            else if(c == 'd') d_num++;
            else if(c == 'a') a_num++;
        }
        answer = n + w_num - s_num + (10*d_num) - (10*a_num);
        return answer;
    }
}