import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int numList[] = new int[n];
        for(int i=0; i<n; i++) {
            numList[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        for(int i=0; i<n; i++) {
            if(findPrimeNumber(numList[i]) == true)
                count++;
        }
        System.out.println(count);
    }

    static boolean findPrimeNumber(int n) {
        int divisor = findDivisorNumber(n);
        if(divisor == 1)
            return true;
        else
            return false;
    }

    static int findDivisorNumber(int n) {
        int divisor = 0;
        for(int i=1; i<n; i++) {
            if((n%i) == 0) {
                divisor++;
            }
        }
        return  divisor;
    }
}