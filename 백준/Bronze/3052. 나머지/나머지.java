import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numArr = new int[10];
        for(int i=0; i<10; i++) {
            numArr[i] = Integer.parseInt(br.readLine());
        }

        boolean[] checkRemainder = new boolean[43];
        for(int i=0; i<10; i++) {
            int remainder = numArr[i] % 42;
            if(checkRemainder[remainder] == false) {
                checkRemainder[remainder] = true;
            }
        }

        int remainderCount = 0;
        for(int i=0; i<43; i++) {
            if(checkRemainder[i] == true) {
                remainderCount++;
            }
        }

        System.out.println(remainderCount);
    }
}