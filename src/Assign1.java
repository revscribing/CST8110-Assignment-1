/**
*    @author Richard Barney
*    Intro to Computer Programming Assignment 1
*    September 2012
*/
import java.util.Scanner;
public class Assign1 {
	public static void main(String[] args) {
		//variable declarations
		Scanner input = new Scanner(System.in);
		int num;
		//statement to enter digit
		System.out.print("Enter a five digit number: ");
		num = input.nextInt();
		//error message if more than 5 digits or less than 5 digits are entered
		while (num >= 100000 || num <= 9999 ) {
			System.out.print("Invalid input. Please enter a five digit number: ");
			num = input.nextInt();
	    }
	    //statement if 5 digits are entered
		System.out.print("The number is: " +"\n" +num/10000%10 +"\n" +num/1000%10 +"\n" +num/100%10 +"\n" +num/10%10 +"\n" +num%10);
	}//end main
}//end class Assign1