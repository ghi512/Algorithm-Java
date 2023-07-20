class Solution {
    public String solution(String[] arr) {
        int len = arr.length;
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<len; i++) {
            sb.append(arr[i]);
        }
        
        String answer = sb.toString();
        return answer;
    }
}