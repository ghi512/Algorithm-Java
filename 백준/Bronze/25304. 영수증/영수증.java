import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int price = sc.nextInt(); // 영수증에 적힌 금액
		int n = sc.nextInt(); // 물건 종류의 수
		int sum = 0;
		int a,b;
		for(int i=0; i<n; i++){
			a = sc.nextInt();
			b = sc.nextInt();
			sum += (a*b);
		}
		if(sum==price){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}