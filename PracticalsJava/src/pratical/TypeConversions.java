/*Write a program to show that during function overloading, if no matching argument 
is found, then Java will apply automatic type conversions(from lower to higher data 
type): program-9 */
package pratical;

public class TypeConversions {
static public void showNumber(int num) {
	System.out.println("Integer number is:"+num);
}
static public void showNumber(double num) {
	System.out.println("Double number is:"+num);
}
public static void main(String[] args) {
	int num1=5;
	showNumber(num1);
	double num2=9.5;
	showNumber(num2);
	byte num3=25;
	showNumber(num3);//Auto type conversion from byte to int
	short num4=156;
	showNumber(num4);//Auto type conversion from short to int
	float num5=8.95f;
	showNumber(num5);//Auto type conversion from float to double
	long num6=67l;
	showNumber(num6);//Auto type conversion from long to double
	char ch='A';
	showNumber(ch);//Auto type conversion from char to int
}
}
