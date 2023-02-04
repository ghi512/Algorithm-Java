import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    int len = input.length();
    int[] alpCount = new int[26];

    for(int i=0; i<len; i++) {
      char searchAlp = input.charAt(i);
      if(searchAlp >= 'A' && searchAlp <= 'Z') { // 대문자인 경우
        alpCount[searchAlp-65]++;
      }
      else { // 소문자인 경우
        alpCount[searchAlp-97]++;
      }
    }

    int max = -1;
    char ch = '?';

    for(int i=0; i<26; i++) {
      if(alpCount[i] > max) {
        max = alpCount[i];
        ch = (char)(i+65);
      }
      else if (alpCount[i] == max) {
        ch = '?';
      }
    }
    System.out.println(ch);
    scanner.close();
  }
}
