import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "";
        n /= 4;
        for(int i=0; i<n; i++){
            s += "long ";
        }
        s += "int";
        System.out.println(s);
    }
}