import java.util.*;

public class Solution {
    public int[] solution(int []arr) {        
        Stack stack = new Stack();
        for(int x : arr) {
            if(stack.empty()) {
                stack.push(x);
                continue;
            }
            if(x == (int)stack.peek()) {
                continue;
            }
            stack.push(x);
        }
        
        int size = stack.size();
        int[] answer = new int[size];
        int temp = size-1;
        for(int i=0; i<size; i++) {
            answer[temp--] = (int)stack.pop();
        }
        return answer;
    }
}