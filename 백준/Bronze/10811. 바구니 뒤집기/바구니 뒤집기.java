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

        int[] arr = new int[n];
        for(int k=1; k<=n; k++) {
            arr[k-1] = k;
        }

        for(int k=0; k<m; k++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()) - 1;
            int j = Integer.parseInt(st.nextToken()) - 1;
            int loop = (j-i+1) / 2;
            for(int l=0; l<loop; l++) {
                int temp = arr[j-l];
                arr[j-l] = arr[i+l];
                arr[i+l] = temp;
            }
        }

        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}