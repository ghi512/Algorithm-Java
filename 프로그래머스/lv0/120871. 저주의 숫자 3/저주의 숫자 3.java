class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] notThree = new int[101];
        
        int num = 1;
        for(int i=1; i<=100; i++) {
            while(true) {
                if(checkTree(num) == true)
                    num++;
                else
                    break;
            }
            notThree[i] = num++;
        }
        
        answer = notThree[n];        
        return answer;
    }
    
    boolean checkTree(int num) {
        boolean answer = false;
        if(num%3 == 0) // 3의 배수인 경우
            answer = true; 
        if(Integer.toString(num).contains("3")) // 숫자 3을 사용하는 경우
            answer = true;
        return answer;
    }
}