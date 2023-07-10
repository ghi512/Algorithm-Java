class Solution {
    public int solution(String[] spell, String[] dic) {
        
        int answer = 0;
        for(String s : dic) {
            for(int i=0; i<spell.length; i++) {
                if(s.contains(spell[i])) {
                    answer = 1;
                }
                else {
                    answer = 2;
                    break;
                }
            }
            if(answer == 1)
                break;
        }         
        return answer;
    }
}