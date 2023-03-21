import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] barLength = new int[3];
        for(int i=0; i<3; i++) {
            barLength[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(barLength);
        int circum = barLength[0] + barLength[1];
        if(circum > barLength[2]) {
            circum += barLength[2];
        }
        else {
            barLength[2] = circum - 1;
            circum += barLength[2];
        }

        System.out.println(circum);
    }
}