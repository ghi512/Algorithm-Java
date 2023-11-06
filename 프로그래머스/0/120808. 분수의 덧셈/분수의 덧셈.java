class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        answer = new int[2];
        int numer = (numer1 * denom2) + (numer2 * denom1);
        int denom = denom1 * denom2;
        int gcd = findgcd(numer, denom);
        numer /= gcd;
        denom /= gcd;
        answer[0] = numer;
        answer[1] = denom;
        
        return answer;
    }
    
    int findgcd (int numer, int denom) {
        int gcd = 1;
        int min = (numer>denom) ? numer : denom;
        for(int i=2; i<= min; i++) {
            if((numer%i == 0) && (denom%i == 0)) {
                gcd = i;
            }
        }
        return gcd;
    }
}