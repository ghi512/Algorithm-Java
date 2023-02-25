import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] basket = new int[n];
        for(int i=0; i<n; i++) {
            basket[i] = i+1;
        }

        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int firstExchangeNumber = Integer.parseInt(st.nextToken());
            int secondExchangeNumber = Integer.parseInt(st.nextToken());
            int temp = basket[firstExchangeNumber-1];
            basket[firstExchangeNumber-1] = basket[secondExchangeNumber-1];
            basket[secondExchangeNumber-1] = temp;
        }

        for(int i=0; i<n; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}