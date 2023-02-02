import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] scores = new int[n];
    for(int i=0; i<n; i++) {
      scores[i] = scanner.nextInt();
    }

    int maxScore = max(scores, n);
    double[] changeScore = new double[n];
    double sum = 0;
    for(int i=0; i<n; i++) {
      changeScore[i] = (double)scores[i] / (double)maxScore * 100;
      sum += changeScore[i];
    }
    System.out.println(sum/n);
    scanner.close();
  }

  static int max(int[] arr, int n) {
    int max = arr[0];
    for(int i=1; i<n; i++) {
      if(arr[i] > max)
        max = arr[i];
    }
    return max;
  }
}
