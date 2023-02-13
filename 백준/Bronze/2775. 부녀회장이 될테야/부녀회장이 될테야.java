import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testCase = Integer.parseInt(br.readLine());

        int[][] apartment = makeApartment();

        for(int i=0; i<testCase; i++) {
            int floor = Integer.parseInt(br.readLine()); // k층
            int line = Integer.parseInt(br.readLine()); // n호

            int numberOfGenerations = apartment[floor][line];
            sb.append(numberOfGenerations);
            sb.append('\n');
        }
        System.out.println(sb);
    }

    static int[][] makeApartment() {
        int[][] apartment = new int[15][15];
        for(int i=1; i<=14; i++) {
            apartment[0][i] = i;
            apartment[i][1] = 1;
        }
        for(int i=1; i<=14; i++) {
            for(int k=2; k<=14; k++) {
                apartment[i][k] = apartment[i-1][k] + apartment[i][k-1];
            }
        }
        return apartment;
    }

}