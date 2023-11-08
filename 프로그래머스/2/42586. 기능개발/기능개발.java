import java.util.*;
import java.lang.Math;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        Queue<Integer> q = new LinkedList<Integer>();
        
        // 각 기능이 완료되기까지 필요한 최소 일수를 queue에 저장
        for(int i=0; i<progresses.length; i++) {
            q.add((int)Math.ceil((100.0-progresses[i])/speeds[i]));
        }
        
        // queue가 빌때까지 반복
        while(!q.isEmpty()) {
            int minDays = q.poll(); // 현재 제일 앞에 있는 기능의 최소 일수 저장
            int funPerDay = 1; // 한 배포일에 배포되는 기능의 개수 저장
            
            // 큐에 기능이 남아있고, 그 기능의 최소 일수가 현재 제일 앞에 있는 기능의 
            // 최소 일수보다 작으면 이미 완료된 기능이므로 배포 기능 개수에 추가
            while(!q.isEmpty() && q.peek() <= minDays) { 
                q.poll();
                funPerDay++;
            }
            
            answer.add(funPerDay); // 각 배포일마다 기능 개수 저장
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}