package pratical;
import java.util.Scanner;
import subSubPackage.Fibonacci;
public class MultiLevelPackUse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of fibonacci number you want to generate:");
		Fibonacci.FibonaciGenerator(sc.nextInt());
		sc.close();
	}
}
