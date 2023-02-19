import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] matrix = new int[n][m];

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(bf.readLine());
            for(int j=0; j<m; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(bf.readLine());
            for(int j=0; j<m; j++) {
                matrix[i][j] += Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}