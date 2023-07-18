import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int len = a.length();
        StringBuffer sb = new StringBuffer();
        
        for(int i=0; i<len; i++) {
            char c = a.charAt(i);
            if(c>='A' && c<='Z') {
                sb.append(Character.toLowerCase(c));
            }
            else {    
                sb.append(Character.toUpperCase(c));
            }
        }
        
        System.out.println(sb);
    }
}