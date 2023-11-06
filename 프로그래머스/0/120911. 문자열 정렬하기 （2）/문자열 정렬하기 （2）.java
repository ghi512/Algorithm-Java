import java.util.*;
class Solution {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase();
        char[] cArr = my_string.toCharArray();
        Arrays.sort(cArr);
        String answer = new String(cArr);
        return answer;
    }
}