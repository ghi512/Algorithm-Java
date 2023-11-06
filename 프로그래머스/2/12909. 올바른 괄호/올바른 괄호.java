import java.util.Stack;
class Solution {
    boolean solution(String s) {
        Stack st = new Stack();

        int len = s.length();
        for(int i=0; i<len; i++) {
            if(s.charAt(i) == '(') { // '('이면 스택에 push
                st.push('(');
            }
            else if (!st.empty()) { // ')'이고 스택에 아이템이 있으면 pop
                st.pop();
            }
            else { // ')'이고 스택에 아이템이 없으면 짝이 맞지 않으므로 false 리턴
                return false;
            }
        }
        
        return st.empty();
    }
}