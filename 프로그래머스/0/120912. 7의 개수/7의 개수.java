class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i=0; i<array.length; i++) {
            String s = Integer.toString(array[i]);
            int len = s.length();
            for(int j=0; j<len; j++) {
                if(s.charAt(j) == '7') {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}