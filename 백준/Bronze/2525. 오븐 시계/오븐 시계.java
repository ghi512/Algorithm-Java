import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); //시, 0~23
        int B = sc.nextInt(); //분, 0~59
        int C = sc.nextInt(); //요리시간, 0~1000

        int hour = A;
        int minute = B + C;
        int temp = 0;

        if(minute >= 60){
            temp = minute/60;
            minute %= 60;
        }
        hour += temp;
        if(hour >= 24){
            hour %= 24;
        }
        System.out.printf("%d %d", hour, minute);
    }
}