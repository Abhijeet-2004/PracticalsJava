//To convert a decimal to binary number
package pratical;
import java.util.Scanner;
public class DecToBinary {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num;
	System.out.print("Enter a number:");
	num=sc.nextInt();
	System.out.println("Binary of "+num+" is ="+Integer.toBinaryString(num));
	sc.close();
}
}
