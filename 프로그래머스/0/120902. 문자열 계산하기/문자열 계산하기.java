import java.util.*;
import java.lang.*;
class Solution {
    public int solution(String my_string) {
        long answer = 0;
        String[] strArr = my_string.split(" ");
        int len = strArr.length;
        int[] numArr = new int[len/2+1];
        char[] operateArr = new char[len/2];
        
        int numIndex = 0;
        int operatorIndex = 0;
        
        for(int i=0; i<len; i++) {
            if(i%2 == 0) {
                numArr[numIndex++] = Integer.parseInt(strArr[i]);
            }
            else {
                operateArr[operatorIndex++] = strArr[i].charAt(0);
            }
        }
        
        int[] operator = new int[operatorIndex];
        for(int i=0; i<operatorIndex; i++) {
            if(operateArr[i] == '+') {
                operator[i] = 1;
            }
            else {
                operator[i] = 0;
            }
        }
        
        numIndex = 1;
        operatorIndex = 0;
        answer = numArr[0];
        for(int i=0; i<len/2; i++) {
            if(operator[operatorIndex] == 1) {
                answer += numArr[numIndex++];
                operatorIndex++;
            }
            else if (operator[operatorIndex] == 0) {
                answer -= numArr[numIndex++];
                operatorIndex++;
            }
        }
        
        return (int)answer;
    }
}