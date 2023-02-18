import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = checkCroatiaCount(input);
        System.out.println(n);
    }

    private static int checkCroatiaCount(String input) {
        int croatiaCounts = 0;
        int len = input.length();

        for(int i=0; i<len; i++) {
            char currentCheck = input.charAt(i);
            if(currentCheck == 'c' && i <len - 1) {
                if(input.charAt(i+1) == '=' || input.charAt(i+1) == '-') {
                    i++;
                }
            }
            else if(currentCheck == 'd' && i < len - 1) {
                if(input.charAt(i+1) == '-') {
                    i++;
                }
                else if(input.charAt(i+1) == 'z' && i < len - 2) {
                    if(input.charAt(i+2) == '=') {
                        i += 2;
                    }
                }
            }
            else if((currentCheck == 'l' || currentCheck == 'n') && i < len - 1) {
                if(input.charAt(i+1) == 'j') {
                    i++;
                }
            }
            else if((currentCheck == 's' || currentCheck == 'z') && i < len - 1) {
                if(input.charAt(i+1) == '=') {
                    i++;
                }
            }
            croatiaCounts++;
        }
        return croatiaCounts;
    }
}