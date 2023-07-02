class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int serviceDrinkNum = n/10; // 서비스로 받은 음료 갯수
        answer = (n*12000) + (2000*(k-serviceDrinkNum));        
        return answer;
    }
}