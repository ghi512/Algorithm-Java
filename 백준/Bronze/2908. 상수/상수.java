import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();

        int A = readReverse(a);
        int B = readReverse(b);

        if(A > B) {
            System.out.println(A);
        }
        else {
            System.out.println(B);
        }
    }

    private static int readReverse(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i=2; i>=0; i--) {
            sb.append(str.charAt(i));
        }
        int result = Integer.parseInt(String.valueOf(sb));
        return result;
    }
}