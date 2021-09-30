//*********************************************************** // Name: Augustus Crosby
// Title: Assignment1.java
// Author: Me
// Description: Gives present value of annuity after input of PMT, interest rate, and number of payments
// Time spent: 1.5 hours
// Date: 1/24/18 //************************************************************
/*a)	Changing the "T" to a "t" created an error because a public class __ must be declared in the same file name.java. The computer doesn't recognize "T" and "t" as the same character, and thus declaring "tempConverter" in "TempConverter.java" just won't work.
b)	Removing ";" created an error in that the computer recognized that there should be a ";" separating the two println() statements, but because there wasn't, there was an error.
c)	Changing the conversion factor from 9.0/5.0 to 9/5 gave no error messages. This is because although 9/5 isn't in the typical double data type format, it is still recognizable as a decimal number because 9/5 = 1.8.
d)	I changed the variable name under the "declared variable" section. This gave me two of the same error saying that it could not find the symbol in the later lines.
e)	Changing BASE to base gave me a similar error code as in d, the symbol could not be found. This is similar to the reasoning I had in a, the computer does not recognize the symbols of upper and lowercase letters to mean the same thing and thus all the capitalizations or lack thereof must be made for every single time it is referenced. 
*/
import java.util.Scanner;

public class Assignment1
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);

		// declare variables
		int pMT = 0; 
		double interest = 0; 
		int numberOfPayments = 0; 
		double presentValueAnnuity = 0;

		// get inputs
		System.out.print("Enter the periodic payment (PMT):");
		pMT = in.nextInt();
		System.out.print("Enter the interest rate:");
		interest = in.nextDouble();
		System.out.print("Enter the number of payments:");
		numberOfPayments = in.nextInt();

		// process inputs
		presentValueAnnuity = pMT*(((Math.pow(interest+1,numberOfPayments-1))/interest)/Math.pow(interest+1,numberOfPayments-1)+1);

		// output results
		System.out.printf("%.1f",
					     presentValueAnnuity);
	}
}