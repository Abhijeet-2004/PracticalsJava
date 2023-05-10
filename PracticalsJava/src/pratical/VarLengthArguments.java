/*1. Write a program to show the use of static functions and to pass variable length 
arguments in a function. Program -11*/
package pratical;
class Arg{
	public static int sumElements(int ...arr) {
		int sum=0;
		for(int n:arr) {
			sum+=n;
		}
		return sum;
	}
}
public class VarLengthArguments {
public static void main(String[] args) {
	System.out.println("Sum is="+Arg.sumElements(10,20));
	System.out.println("Sum is="+Arg.sumElements(10,20,30));
	System.out.println("Sum is="+Arg.sumElements(10,20,30,40));
	System.out.println("Sum is="+Arg.sumElements(10,20,30,40,50));
	System.out.println("Sum is="+Arg.sumElements(10,20,30,40,50,60));
}
}
