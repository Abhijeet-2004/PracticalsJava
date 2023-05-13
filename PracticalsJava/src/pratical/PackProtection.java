/* Write a program that creates illustrates different levels of protection in classes/sub 
classes belonging to same package or different packages : Program -15 */
package pratical;
import package2.OtherClass;
import package2.SubClass1;
public class PackProtection {
public static void main(String[] args) {
	Class2 o2=new Class2();
	SubClass1 o3=new SubClass1();
	OtherClass o4=new OtherClass();
	o2.method();
	o3.method();
	o4.method();
	
}
}
