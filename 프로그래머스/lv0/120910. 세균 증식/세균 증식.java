import java.lang.Math;
class Solution {
    public int solution(int n, int t) {
        long answer = n * (long)Math.pow(2,t);     
        return (int)answer;
    }
}