class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = {};
        answer = new int[numbers.length];
        
        if(direction.equals("right")) {
            answer[0] = numbers[numbers.length-1];
            int index = 0;
            for(int i=1; i<numbers.length; i++) {
                answer[i] = numbers[index++];
            }
        }
        
        if(direction.equals("left")) {
            answer[numbers.length-1] = numbers[0];
            int index = 1;
            for(int i=0; i<numbers.length-1; i++) {
                answer[i] = numbers[index++];
            }
        }
        
        return answer;
    }
}