class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String st = Integer.toString(num);
        char[] numArr = st.toCharArray();
        int len = numArr.length;
        
        for(int i=0; i<len; i++) {
            if(numArr[i]-'0' == k) {
                answer = i+1;
                break;
            }
        }
        
        return answer;
    }
}