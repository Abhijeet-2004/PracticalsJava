//To check if a number is prime or not , by taking the number as input from the keyboard
package pratical;
import java.util.Scanner;
class Prime{
	public static void main(String[] args) {
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number=");
		number=sc.nextInt();
		Boolean flag=true;
		for(int i=2;i<number/2;i++){
			if(number%i==0){
				System.out.println(number+" is not a prime number");
				flag=false;
				break;
			}
		}
		if(flag==true)
			System.out.println(number+" is a prime number");
		sc.close();
	}
}