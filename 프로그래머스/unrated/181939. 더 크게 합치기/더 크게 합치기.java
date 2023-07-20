class Solution {
    public int solution(int a, int b) {
        StringBuilder sb = new StringBuilder();
        
        sb.append(Integer.toString(a));
        sb.append(Integer.toString(b));
        int ab = Integer.parseInt(sb.toString());
        
        sb = new StringBuilder();
        sb.append(Integer.toString(b));
        sb.append(Integer.toString(a));
        int ba = Integer.parseInt(sb.toString());
        
        int answer = (ab>ba) ? ab : ba;
        return answer;
    }
}