
public class SwitchDemo2 {
	public static void main(String[] args) {
		int rand = (int)(Math.random() * 10 + 1);

		switch(rand) {
			case 6 :
				System.out.println("Pineapplies"); break;
			default : 
				System.out.println("Nuts");   break;
			case 1 :
				System.out.println("Bananas"); break;
			case 2 :
				System.out.println("Oranges");  break;
			case 3 :
				System.out.println("Peach");
			case 4 : 
				System.out.println("Apples");
			case 5 :
				System.out.println("Plums");   break;
			
			case 7 :  break;
		}
		System.out.println("rand = " + rand);
	}
}