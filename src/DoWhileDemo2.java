
public class DoWhileDemo2 {
	public static void main(String[] args) {
		//1부터 6까지의 랜덤값을 추출하되 서로 다른 2개를 출력하는 프로그램
		
		
		int rand1, rand2;
//		for( ;  ; ) 
//		while(true)
		do{
			rand1 = (int)(Math.random()* 6 + 1);
			rand2 = (int)(Math.random()* 6 + 1);

		}while(rand1 == rand2);
		
		System.out.println("rand1 = " + rand1 +" ,rand2 = " + rand2);
		
		
		
		

}
}
