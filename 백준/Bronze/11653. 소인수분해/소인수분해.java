import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        boolean isPrime = true;
        while(isPrime) {
            int i;
            for(i=2; i<=n; i++) {
                if(n%i == 0) {
                    sb.append(i).append('\n');
                    n /= i;
                    break;
                }
            }
            if(i > n) {
                isPrime = false;
                break;
            }
        }
        System.out.println(sb);
    }
}