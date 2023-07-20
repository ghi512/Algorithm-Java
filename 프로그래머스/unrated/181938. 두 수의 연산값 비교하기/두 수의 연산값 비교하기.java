class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
        int xor = Integer.parseInt(sb.append(a).append(b).toString());
        int mul = 2 * a * b;
        
        answer = (xor>=mul) ? xor : mul;
        return answer;
    }
}