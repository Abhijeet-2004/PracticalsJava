package pratical;
import java.util.Scanner;
public class SumExample {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=Integer.parseInt(args[0]);
	int sum=0;
	System.out.println("Enter "+num+" integer numbers:");
	for(int i=0;i<num;i++) {
		sum+=sc.nextInt();
	}
	System.out.println("Sum of the entered number is:"+sum);
	sc.close();
}
}
