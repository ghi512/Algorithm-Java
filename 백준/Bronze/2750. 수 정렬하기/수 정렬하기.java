import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numArr = new int[n];
        for(int i=0; i<n; i++) {
            numArr[i] = Integer.parseInt(br.readLine());
        }

        int[] resultArr = myInsertionSort(numArr, n);
        for(int i=0; i<n; i++) {
            System.out.println(resultArr[i]);
        }
    }

    private static int[] myInsertionSort(int[] arr, int n) {
        for(int i=1; i<n; i++) {
            int target = arr[i];
            int j = i-1;
            while(j>=0 && target < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = target;
        }
        return arr;
    }

}