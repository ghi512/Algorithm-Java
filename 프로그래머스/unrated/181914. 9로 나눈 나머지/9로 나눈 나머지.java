class Solution {
    public int solution(String number) {
        char[] numArr = number.toCharArray();
        
        int sum = 0;
        for(char c : numArr) {
            sum += (c - '0');
        }
        System.out.println(sum);
        int answer = sum % 9;
        
        return answer;
    }
}