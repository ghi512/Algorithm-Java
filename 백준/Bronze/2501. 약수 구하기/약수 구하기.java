import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] divisor = new int[N];
        int divisorNum = 0;
        for(int i=1; i<=N; i++) {
            if(N%i == 0) {
                divisor[divisorNum++] = i;
            }
        }

        int result = 0;
        if(divisor[K-1] != 0) {
            result = divisor[K-1];
        }
        System.out.println(result);
    }
}