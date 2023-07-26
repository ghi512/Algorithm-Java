import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        int index = 0;
        for(int i=0; i<arr.length; i++) {
            if(stk.isEmpty()) {
                stk.add(arr[i]);
                index++;
            }
            else {
                if(stk.get(index-1) < arr[i]) {
                    stk.add(arr[i]);
                    index++;
                }
                else {
                    stk.remove(index-1);
                    index--;
                    i--;
                }
            }
        }
        
        int[] answer = stk.stream().mapToInt(i->i).toArray();
        return answer;
    }
}