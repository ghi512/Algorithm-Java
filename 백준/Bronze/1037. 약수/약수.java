import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfN = Integer.parseInt(br.readLine());
        int[] divisorOfN = new int[numOfN];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<numOfN; i++) {
            divisorOfN[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(divisorOfN);
        int n;
        if(numOfN == 1) {
            n = divisorOfN[0] * divisorOfN[0];
        }
        else {
            n = divisorOfN[0] * divisorOfN[numOfN-1];
        }
        System.out.println(n);
    }
}