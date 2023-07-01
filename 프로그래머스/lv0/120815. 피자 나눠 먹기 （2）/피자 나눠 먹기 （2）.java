class Solution {
    public int solution(int n) {
        int answer = 0;       
        answer = (getLcm(n, 6) / 6);
        return answer;
    }
    
    // 최소공배수 구하기
    int getLcm(int n, int m) {
        int gcd = getGcd(n, m);
        int lcm = n * m / gcd;
        return lcm;
    }
    
    // 최대 공약수 구하기
    int getGcd(int n, int m) {
        int min = (n<m) ? n : m;
        int gcd = 1;
        for(int i=2; i<=min; i++) {
            if((n%i == 0) && (m%i==0)) {
                gcd = i;
            }
        }
        
        return gcd;
    }
}