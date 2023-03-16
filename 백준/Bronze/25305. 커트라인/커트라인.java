import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nk = br.readLine().split(" ");
        String[] scores = br.readLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);

        int[] score = new int[n];
        for(int i=0; i<n; i++) {
            score[i] = Integer.parseInt(scores[i]);
        }

        Arrays.sort(score);
        System.out.println(score[n-k]);
    }
}