/**
 * This class simply asks the user to enter a five digit number and displays each 
 * number individually on a separate line.
 *  @author Richard Barney
 *  @version 1.0.0 September 2012
*/
//import statements
import java.util.Scanner;
public class Assign1 {
	/**
	 * main method as required by JVM
	 * @param  args   standard command line parameters as a string array.
	 */
	public static void main(String[] args) {
		// variable declarations
		Scanner input = new Scanner(System.in);
		int num;
		
		// prompr user for number
		System.out.print("Enter a five digit number: ");
		num = input.nextInt();
		
		//error message if more than 5 digits or less than 5 digits are entered
		while (num >= 100000 || num <= 9999 ) {
			System.out.print("Invalid input. Please enter a five digit number: ");
			num = input.nextInt();
		}
		
	    //statement if 5 digits are entered
		System.out.print("The number is: " +"\n" +num/10000%10 +"\n" +num/1000%10 +"\n" +num/100%10 +"\n" +num/10%10 +"\n" +num%10);
	} // end method main
} //end class Assign1