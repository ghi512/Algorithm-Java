import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 응시자 수
        int k = Integer.parseInt(st.nextToken()); // 상을 받는 사람 수

        int[] score = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            score[i] = Integer.parseInt(st.nextToken());
        }

        score = myBubbleSort(score, n);
        System.out.println(score[k-1]);

    }

    private static int[] myBubbleSort(int[] score, int n) {
        for(int i=n-1; i>0; i--) {
            for(int j=0; j<i; j++) {
                if(score[j] < score[j+1]) {
                    int temp = score[j];
                    score[j] = score[j+1];
                    score[j+1] = temp;
                }
            }
        }
        return score;
    }


}