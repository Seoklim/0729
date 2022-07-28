import java.util.Scanner;

public class IfDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("출생년도 : ");
		int bornYear = sc.nextInt();
		System.out.println(2022 - bornYear + 1 + "살.");
		if(bornYear % 12 == 0) System.out.println("원숭이띠입니다.");
		if(bornYear % 12 == 1) System.out.println("닭띠입니다.");
		if(bornYear % 12 == 2) System.out.println("개띠입니다.");
		if(bornYear % 12 == 3) System.out.println("돼지띠입니다.");
		if(bornYear % 12 == 4) System.out.println("쥐띠입니다.");
		if(bornYear % 12 == 5) System.out.println("소띠입니다.");
		if(bornYear % 12 == 6) System.out.println("호랑이띠입니다.");
		if(bornYear % 12 == 7) System.out.println("토끼띠입니다.");
		if(bornYear % 12 == 8) System.out.println("용띠입니다.");
		if(bornYear % 12 == 9) System.out.println("뱀띠입니다.");
		if(bornYear % 12 == 10) System.out.println("말띠입니다.");
		if(bornYear % 12 == 11) System.out.println("양띠입니다.");
	}
}