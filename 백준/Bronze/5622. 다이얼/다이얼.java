import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String dial = br.readLine();
        int length = dial.length();
        int time = 0;

        for(int i=0; i<length; i++) {
            char ch = dial.charAt(i);
            if(ch >= 'A' && ch <= 'C') {
                time += 3;
            }
            else if(ch <= 'F') {
                time += 4;
            }
            else if(ch <= 'I') {
                time += 5;
            }
            else if(ch <= 'L') {
                time += 6;
            }
            else if (ch <= 'O') {
                time += 7;
            }
            else if(ch <= 'S') {
                time += 8;
            }
            else if(ch <= 'V') {
                time += 9;
            }
            else if (ch <= 'Z') {
                time += 10;
            }
        }

        System.out.println(time);

    }
}