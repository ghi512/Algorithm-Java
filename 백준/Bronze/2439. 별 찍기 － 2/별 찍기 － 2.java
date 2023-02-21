import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=n; i++) {
            for(int blank=n-i; blank >0; blank--) {
                sb.append(' ');
            }
            for(int star=1; star<=i; star++) {
                sb.append('*');
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}