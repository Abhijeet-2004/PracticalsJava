package subSubPackage;

public class Fibonacci {
public static void FibonaciGenerator(int n) {
	System.out.println("First "+n+" fibonacci series :");
	for(int i=0;i<n;i++) {
		System.out.print(fibo(i)+" ");
	}
}
private static int fibo(int num) {
	if(num==0)
		return 0;
	else if(num==1)
		return 1;
	else 
		return fibo(num-1)+fibo(num-2);
}
}
