import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> primeNumberList = new ArrayList<>();

        for(int i=m; i<=n; i++) {
            if(isPrime(i) == true) {
                primeNumberList.add(i);
            }
        }

        if(primeNumberList.size() == 0) {
            System.out.println(-1);
        }
        else {
            int sum = 0;
            for(int i=0; i<primeNumberList.size(); i++) {
                sum += primeNumberList.get(i);
            }
            System.out.println(sum);
            System.out.println(primeNumberList.get(0));
        }
    }

    static boolean isPrime(int n) {
        int divisor = 0;
        for(int i=1; i<n; i++) {
            if((n%i) == 0)
                divisor++;
        }

        if(divisor==1)
            return true;
        else
            return false;
    }


}