import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int n = 0;
        if(c-b <=0 )
            n = -1;
        else {
            n = a / (c - b) + 1;
        }

        System.out.println(n);
    }
}