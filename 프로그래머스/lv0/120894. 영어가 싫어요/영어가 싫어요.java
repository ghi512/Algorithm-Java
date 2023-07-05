class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String temp = numbers;
        String[] numEng = {"zero", "one", "two", "three", "four", 
                           "five", "six", "seven", "eight", "nine"};
        
        for(int i=0; i<10; i++) {
            String s = Integer.toString(i);
            temp = temp.replaceAll(numEng[i], s);
        }
        
        System.out.println(temp);
        answer = Long.parseLong(temp);        
        
        return answer;
    }
}