import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int sum=0;
		
		for(int i=1; i<=10; i++) {
			
			System.out.println("Enter number # "+i);
		boolean hasNextInt = scanner.hasNextInt();
			if (hasNextInt) {
			int number= scanner.nextInt();
				
				
			sum= sum + number;
				
					
				
			}
			else {
				System.out.println("invalid value");
				i--;
			}
			scanner.nextLine();
		
}
		    System.out.println("Sum = "+sum);
		    scanner.close();
}



	}


