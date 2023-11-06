class Solution {
    public int[] solution(int money) {
        int[] answer = {};
        int num = money / 5500;
        int changes = money - (5500 * num);
        answer = new int[] {num, changes};
        return answer;
    }
}