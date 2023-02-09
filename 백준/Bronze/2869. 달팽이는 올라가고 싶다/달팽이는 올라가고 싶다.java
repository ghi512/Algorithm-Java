import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken()); // 낮에 올라간 거리 (m)
        int b = Integer.parseInt(st.nextToken()); // 밤에 미끄러진 거리 (m)
        int v = Integer.parseInt(st.nextToken()); // 나무 막대 길이 (m)

        int distance = v - a; // 첫 날 낮에 올라가고 남은 나무 거리
        int days = 1;
        int oneDayLong = a - b;

        days += (distance / oneDayLong);
        if((distance % oneDayLong) > 0)
            days++;

        System.out.println(days);
    }
}