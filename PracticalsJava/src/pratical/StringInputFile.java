/* Create a multi-file program where in one file a string message is taken as in put from 
the user and the function to display the message on the screen is given in another 
file (make use of Scanner package in this program). Program-13*/
package pratical;

import java.util.Scanner;

public class StringInputFile {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str;
	System.out.println("Enter a string:");
	str=sc.nextLine();
	StringDisplay.display(str);
	sc.close();
}
}
