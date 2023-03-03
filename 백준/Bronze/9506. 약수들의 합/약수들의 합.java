import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
            int n = Integer.parseInt(br.readLine());
            if(n == -1) {
                break;
            }
            int[] divisor = new int[n/2];
            divisor = getDivisor(n);
            int divisorNum = getDivisorNum(divisor, n/2);
            if(n == divisorSum(divisor, divisorNum)) {
                sb.append(n + " = ");
                int i=0;
                for(i=0; i<divisorNum-1; i++) {
                    sb.append(divisor[i] + " + ");
                }
                sb.append(divisor[i] + "\n");
            }
            else {
                sb.append(n + " is NOT perfect.\n");
            }
        }
        System.out.println(sb);
    }

    private static int getDivisorNum(int[] divisor, int n) {
        int num = 0;
        for(int i=0; i<n; i++) {
            if(divisor[i] == 0)
                break;
            num++;
        }
        return num;
    }

    private static int divisorSum(int[] divisor, int divisorNum) {
        int sum = 0;
        for(int i=0; i<divisorNum; i++) {
            sum += divisor[i];
        }
        return sum;
    }

    private static int[] getDivisor(int n) {
        int[] divisor = new int[n/2];
        int divisorNum = 0;
        for(int i=1; i<=(n/2); i++) {
            if(n%i == 0) {
                divisor[divisorNum++] = i;
            }
        }
        return divisor;
    }
}