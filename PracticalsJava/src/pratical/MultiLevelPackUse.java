/*Write a program to create a multilevel package and also creates a reusable class to 
generate Fibonacci series, where the function to generate Fibonacci series is given in 
a different file belonging to the same package. program-14 */
package pratical;
import java.util.Scanner;
import pratical.SubPackage.SubSubPackage.Fibonacci;
public class MultiLevelPackUse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of fibonacci number you want to generate:");
		Fibonacci.FibonaciGenerator(sc.nextInt());
		sc.close();
	}
}
