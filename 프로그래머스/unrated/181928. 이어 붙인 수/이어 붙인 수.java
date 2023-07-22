class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        StringBuffer odd = new StringBuffer();
        StringBuffer even = new StringBuffer();
        
        for(int i=0; i<num_list.length; i++) {
            if(num_list[i]%2==0) { // 짝수이면
                even.append(num_list[i]);
            }
            else {
                odd.append(num_list[i]);
            }
        }
  
        answer = Integer.parseInt(odd.toString()) + Integer.parseInt(even.toString());
        return answer;
    }
}