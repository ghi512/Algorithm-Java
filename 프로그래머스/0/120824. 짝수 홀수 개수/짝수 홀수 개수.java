class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int odd = 0; // 홀수
        int even = 0; // 짝수
        for(int i=0; i<num_list.length; i++) {
            if(num_list[i]%2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }
        answer = new int[] {even, odd};        
        return answer;
    }
}