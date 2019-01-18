import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create a scanner for user input
		Scanner input = new Scanner(System.in);
		
		//ask user for the annual interest 
		System.out.println("Please enter the annual interest rate in decimal form, e.g. 3.25: ");
		
		//get the interest rate which user provides
		double air = input.nextDouble();
		
		//calculate the monthly interest rate
		double mir = air / 1200;
		
		//ask user for the amount of years
		System.out.println("Please enter the number of years intended in integer form, e.g., 5 or 10: ");
		
		//get the number of years which user provides
		int years = input.nextInt();
		
		//ask the user for the loan amount
		System.out.println("Please enter the loan amount in decimal form, e.g., 1250.50");
		
		//get the loan amount which user provides
		double loan = input.nextDouble();
		
		//calculate the monthly payment using the loan and monthly interest
		double monthly = loan * mir / (1-1/Math.pow(1 + mir, years*12));
		
		//display the monthly payment
		System.out.println("Your Monthly payment will be: $"+ (int)(monthly*100/100.0));
		
		//calculate the total payment using the monthly payment and number of years
		double total = monthly * years * 12;
		
		//display the total payment
		System.out.println("Your Total payment will be: $"+ (int)(total*100/100.0));
		
		input.close();
		
	}
}