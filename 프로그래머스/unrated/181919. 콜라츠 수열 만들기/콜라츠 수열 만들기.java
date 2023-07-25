import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList();
        int index = 0;
        list.add(index++, n);
        while(n!=1) {
            if(n%2 == 0) {
                list.add(index++, n/2);
                n = n/2;
            }
            else {
                list.add(index++, 3*n+1);
                n = 3*n + 1;
            }
        }
        
        int[] answer = list.stream().mapToInt(i -> i).toArray();       
        return answer;
    }
}