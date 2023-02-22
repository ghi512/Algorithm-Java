import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] whiteBoard= new char[5][15];

        for(int i=0; i<5; i++) {
            String word = br.readLine();
            for(int j=0; j<word.length(); j++) {
                whiteBoard[i][j] = word.charAt(j);
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<15; i++) {
            for(int j=0; j<5; j++) {
                if(whiteBoard[j][i] != 0) {
                    sb.append(whiteBoard[j][i]);
                }
            }
        }

        System.out.println(sb);

    }
}