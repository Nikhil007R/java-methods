import java.util.Scanner; 

class SimpleInterest{

	static void getSimpleInterest(int Principal, int Rate, int Time){
		System.out.println(Principal * Rate * Time/100);
	}
	

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		// taking user input principal, rate and time.
		System.out.println("Enter Principal, Rate and Time: ");
		int Principal = sc.nextInt();

		int Rate = sc.nextInt();
		int Time = sc.nextInt();

		getSimpleInterest(Principal, Rate, Time);
	}
}
