import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int deno = 0; // 분모
        int nume = 0; // 분자

        int k = 1;
        while (n > fact(k)) {
            k++;
        }

        if(k%2 != 0) { // k가 홀수이면 아래에서 위로 올라가는 방향
            deno = n - fact(k-1);
            nume = k + 1 - deno;
        }
        else { // k가 짝수이면 위에서 아래로 내려가는 방향
            deno = fact(k) - n + 1;
            nume = k + 1 - deno;
        }

        sb.append(nume);
        sb.append('/');
        sb.append(deno);

        System.out.println(sb);
    }

    static int fact(int n) {
        int result = 0;
        for(int i=1; i<=n; i++) {
            result += i;
        }
        return  result;
    }
}