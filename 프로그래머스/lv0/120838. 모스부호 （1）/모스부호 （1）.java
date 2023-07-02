import java.util.*;
class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String[] morse = {".-", "-...", "-.-." ,"-..", ".", "..-.",
                          "--.", "....", "..", ".---", "-.-", ".-..",
                          "--", "-.", "---", ".--.", "--.-", ".-.",
                          "...", "-", "..-", "...-", ".--", "-..-",
                          "-.--", "--.."};
        String[] morseStr = letter.split(" ");
        
        StringBuffer sb = new StringBuffer();
        int num = 'a';
        for(int i=0; i<morseStr.length; i++) {
            for(int j=0; j<26; j++) {
                if(morse[j].equals(morseStr[i])) {
                    sb.append((char)(num+j));
                    break;
                }
            }
        }
        
        answer = sb.toString();      
        return answer;
    }
}