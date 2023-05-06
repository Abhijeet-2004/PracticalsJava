//To find the sum of any number of integers entered as command line arguments : Practical-1
package pratical;
public class SumOfIntegers {
public static void main(String[] args) {
	int sum=0;
	for(int i=0;i<args.length;i++) {
		sum+=Integer.parseInt(args[i]);
	}
	System.out.println("Sum of the number passed through command line argument is:"+sum);
}
}
