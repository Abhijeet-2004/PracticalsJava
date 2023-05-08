/*Write a program to show that during function overloading, if no matching argument 
is found, then Java will apply automatic type conversions(from lower to higher data 
type): program-9 */
package pratical;

public class TypeConversions {
public void showNumber(int num) {
	System.out.println("Integer number is:"+num);
}
public void showNumber(double num) {
	System.out.println("double number is:"+num);
}
public static void main(String[] args) {
	TypeConversions ob=new TypeConversions();
	int num1=5;
	ob.showNumber(num1);
	double num2=9.5;
	ob.showNumber(num2);
	byte num3=25;
	ob.showNumber(num3);//Auto type conversion from byte to int
	short num4=156;
	ob.showNumber(num4);//Auto type conversion from short to int
	float num5=8.95f;
	ob.showNumber(num5);//Auto type conversion from float to double
	long num6=67l;
	ob.showNumber(num6);//Auto type conversion from long to double
	char ch='A';
	ob.showNumber(ch);//Auto type conversion from char to int
}
}
