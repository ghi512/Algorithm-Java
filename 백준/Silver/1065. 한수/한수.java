import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(findHansooNumber(n));
    }

    private static int findHansooNumber(int n) {
        int HansooNumber = 0;

        if(n < 100) {
            HansooNumber = n;
        }
        else if(n < 1000) {
            HansooNumber += 99;
            for(int i=100; i<=n; i++) {
                if(isHansoo(i) == true)
                    HansooNumber++;
            }
        }
        else {
            HansooNumber = findHansooNumber(999);
        }

        return HansooNumber;
    }

    private static boolean isHansoo(int i) {
        int hundreds = i/100;
        i %= 100;
        int tens = i/10;
        i %= 10;
        int units = i;

        if((hundreds - tens) == (tens - units))
            return true;
        else
            return false;
    }
}