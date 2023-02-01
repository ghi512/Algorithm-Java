import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();
    int n = input;
    int newNum = 100, count = 0, temp;

    while(input != newNum) {
      temp = n/10 + n%10;
      newNum = n%10*10 + temp%10;
      n = newNum;
      count += 1;
    }
    System.out.println(count);
    scanner.close();
  }
}
