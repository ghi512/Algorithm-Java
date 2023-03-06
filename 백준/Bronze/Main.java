import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int wordLength = word.length();
        int result = 1;
        for(int i=0; i<wordLength/2; i++) {
            if(word.charAt(i) != word.charAt(wordLength-i-1)) {
                result = 0;
                break;
            }
        }
        System.out.println(result);
    }
}