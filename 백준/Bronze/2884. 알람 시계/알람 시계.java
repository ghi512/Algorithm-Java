import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int h = scanner.nextInt();
    int m = scanner.nextInt();

    if(m >=0 && m <=44) {
      m = m + 60 - 45;
      if(h==0)
        h = 23;
      else
        h -= 1;
    }
    else {
      m -= 45;
    }
    System.out.printf("%d %d", h, m);
    scanner.close();
  }
}
