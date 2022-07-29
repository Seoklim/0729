import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Client jimin = new Client();
		System.out.print("Name : ");      jimin.name = sc.nextLine();
		System.out.print("Age : ");         jimin.age = sc.nextInt();
		sc.nextLine();   //입력 Buffer Clear
		System.out.print("Gender(남성 : m / 여성 : f) : ");
		String gender = sc.nextLine();    //  "m"
		jimin.gender = gender.charAt(0);   //  'm'
		
		System.out.print("Weight : ");     jimin.weight = sc.nextDouble();
		System.out.print("Height : ");      jimin.height = sc.nextDouble();
		
		double bmi = jimin.weight / ((jimin.height * 0.01) * (jimin.height * 0.01));
		jimin.bmi = bmi;   //지민 고객의 bmi를 할당
		
		if(bmi >= 35)  jimin.result = "고도 비만";
		else if(bmi >= 30 && bmi < 35) jimin.result = "중도비만(2단계 비만)";
		else if(bmi >= 25 && bmi < 30) jimin.result = "경도 비만(1단계 비만)";
		else if(bmi >= 23 && bmi < 25) jimin.result = "과체중";
		else if(bmi >= 18.5 && bmi < 23) jimin.result = "정상";
		else jimin.result = "저체중";
		
		System.out.println("<<고객 검진 결과>>");
		System.out.println("이름 : " + jimin.name);
		System.out.println("나이 : " + jimin.age);
		System.out.print("성별 : ");
		System.out.println( (jimin.gender == 'm') ? "남성" : "여성");
		System.out.println("신장 : " + jimin.height);
		System.out.println("체중 : " + jimin.weight);
		System.out.println("BMI 지수 : " + jimin.bmi);
		System.out.println("결과 : " + jimin.result);
		System.out.println("Thank You...");
	}
}