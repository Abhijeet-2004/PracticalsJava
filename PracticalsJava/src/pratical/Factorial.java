//To find the factorial of a number :Practical-2
package pratical;
import java.util.Scanner;
public class Factorial {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num;
	System.out.print("Enter a number:");
	num=sc.nextInt();
	System.out.print("Factorial of "+num+" is="+fact(num));
	sc.close();
}
static int fact(int num) {
	if(num==0||num==1)
		return 1;
	else
		return num*fact(num-1);
}
}
