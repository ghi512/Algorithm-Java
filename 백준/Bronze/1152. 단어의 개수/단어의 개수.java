import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String sentence = scanner.nextLine();
    int wordCount = 0;
    int sentenceLen = sentence.length();
    for(int i=0; i<sentenceLen; i++) {
      if (sentence.charAt(i) == ' ')
        wordCount++;
    }
    wordCount++;

    if (sentence.charAt(0)==' ')
      wordCount--;
    if (sentence.charAt(sentenceLen-1)==' ')
      wordCount--;

    System.out.println(wordCount);
    scanner.close();
  }
}
