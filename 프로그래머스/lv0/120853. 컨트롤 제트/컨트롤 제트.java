import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arr = s.split(" ");
        for(int i=0; i<arr.length; i++) {
            System.out.printf("%s ", arr[i]);
            int num = 0;
            if(arr[i].equals("Z")) {
                num = Integer.parseInt(arr[i-1]);
                answer -= num;
            }
            else {
                num = Integer.parseInt(arr[i]);
                answer += num;
            }
        }
        return answer;
    }
}