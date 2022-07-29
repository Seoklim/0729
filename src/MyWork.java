
public class MyWork {
public static void main(String[] args) {
		
	//x는 1부터2씩증가
	//Y는 100부터 3씩 감소
	//교차할때의 x,y의 값은?
//	int x,y;
//	for(x = 1, y = 100 ; x < 101 ; x+=2, y -=3) {
//			if(x>y)break;
//		}
//	System.out.printf("x=%d, y=%d\n", x, y);
	
	//1부터 10까지 출력하기
//	int i = 1; // 초기화
//	for(    ; i < 11 ;   ) {
//		System.out.print(i + "\t");
//		i++;
//	}

//	int y = 1; //초기화
//	while(y < 11) {
//		System.out.print(y + "\t");
//		y++; //증감
//	}

//	int x = 1;
//	while(x<10) {
//		int y = 2;
//		while(y<10) {
//			System.out.printf("%d x %d = %d\t", y, x, y*x);
//			y++;
//		}
//		x++;
//		System.out.println();
//}
	int count = 0;
	int line = 1;
	int x = 65;
	while(x <= 90) {
		if(line % 2 == 0)System.out.printf("%c\t", x+32);
		else System.out.printf("%c\t", x);
		x++;
		count++;
		if(count == 5) {
			System.out.println();
			count = 0;
			line++;
		}		
	}
	
}
}
