/* Create a multi-file program where in one file a string message is taken as in put from 
the user and the function to display the message on the screen is given in another 
file (make use of Scanner package in this program). Program-13*/
package pratical;

import java.util.Scanner;

public class StringInputFile {
private String str;
public void setStr(String str) {
	this.str=str;
}
public String getStr() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String:");
	setStr(sc.nextLine());
	sc.close();
	return str;
}
}
