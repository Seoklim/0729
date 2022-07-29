import java.util.Scanner;

public class ForDemo {
	public static void main(String[] args) {
//1~100누적함
//		int sum = 0;
//		for(int i = 1; i <=100; i++) {
//			//sum = sum + i;
//			sum += i;
//		}
//		System.out.println("sum = " + sum);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 fatorial 을 원하십니까 : ");
		
		int su = sc.nextInt();
		int result = 1;
		
		for(int i = su; i >= 1; i--) {
		//result = result * i;
			result *= i;
}
		System.out.printf("%d! = %d\n", su, result);
}
}