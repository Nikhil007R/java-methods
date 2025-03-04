import java.util.Scanner;

class TriangularPark{
	
	public static void rounds(int distance, int perimeter){
		System.out.println("The athlete needs to run " + distance/perimeter + " rounds ");
	}

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		// taking sides as an input: 
		System.out.println("ENter sides of triangle a,b,c in meters: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int distance = 5000;

		int perimeter = a+b+c;
		rounds(distance, perimeter);
		
	}
}
