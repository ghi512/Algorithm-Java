class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=10; i++) {
            if(facto(i) >= n) {
                if(facto(i) == n) {
                    answer = i;
                    break;
                }
                else {
                    answer = i-1;
                    break;
                }
            }
        }
        
        return answer;
    }
    
    int facto(int n) {
        if(n == 1) {
            return 1;
        }
        return n * facto(n-1);
    }
}