import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int arrNum = array.length;
        Arrays.sort(array);
        answer = array[(arrNum-1)/2];
        return answer;
    }
}