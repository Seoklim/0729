import java.util.GregorianCalendar;
import java.util.Scanner;
//그 달 1일이 무슨요일인가
//1년1월1일 월요일 ---- 그뒤로 지금까지의 날짜를 7로나누어서떨어지면 일요일
public class MyCalendar {
	
	static GregorianCalendar gc = new GregorianCalendar();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		System.out.print("Year : ");
		int year = sc.nextInt();
		System.out.print("Month : ");
		int month = sc.nextInt();
		
		int day = 1;
		int sum = 0;
		
		for(int i = 1; i <year; i++ ) {
			if(gc.isLeapYear(i)) {  //i가 윤년입니까?
 				sum += 366;    //i가 윤년이라면
 			}
			else {
				sum += 365;    //i가 윤년이 아니라면
			}
		} //작년 12월31일까지 합

		for(int i = 1; i < month; i++) {
			sum += getLastDay(year, i);
		}     //올해 6월까지 합
		sum++; //6월 마지막날 다음날
		
		switch(sum % 7) {
		case 0 : System.out.println("SUN"); break;
		case 1 : System.out.println("Mon"); break;
		case 2 : System.out.println("tue"); break;
		case 3 : System.out.println("wed"); break;
		case 4 : System.out.println("thu"); break;
		case 5 : System.out.println("fri"); break;
		case 6 : System.out.println("sat"); break;

		}

		
		
	}//main() end
	
	
	
	//년도와 월을 입력받아서 그 달 마지막 일을 넘겨주는 메소드
	static int getLastDay(int year, int month) {   // 메소드기준으로 들어가는것 ()안에    나오는것은 메소드앞에
		int lastDay = 0;
		if(month == 2) { //2월이라면
			if(gc.isLeapYear(year)) {
				lastDay = 29;                //2월인데 윤년
			}
			else lastDay = 28;               //2월인데 윤년이 아님
				
		else if(month != 2) { //2월이 아니라면
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			return lastDay = 31;
		}
		else if(month == 4 || month == 6 || month == 9 || month == 11) {
			lastDay = 30;
		}
		}
		return lastDay;
	}
	
	
} 
}
	