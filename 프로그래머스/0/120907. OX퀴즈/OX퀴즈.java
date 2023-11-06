class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        StringBuffer sb = new StringBuffer();
        int index = 0;
        
        for(int i=0; i<quiz.length; i++) {
            if(checkRight(quiz[i]) == true) {
                answer[index++] = "O";
            }
            else {
                answer[index++] = "X";
            }
        }
        
        return answer;
    }
    
    boolean checkRight(String st) {
        String[] stArr = st.split(" ");
        int x = Integer.parseInt(stArr[0]);
        int y = Integer.parseInt(stArr[2]);
        int z = Integer.parseInt(stArr[4]);
        int result = 0;
        
        if(stArr[1].equals("+")) {
            result = x+y;
        }
        else {
            result = x-y;
        }
        
        boolean answer = true;
        if(result == z) {
            answer = true;
        }
        else {
            answer = false;
        }
        
        return answer;
    }
}