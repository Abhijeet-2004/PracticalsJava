package package2;
import pratical.Class1;
public class OtherClass {
public void method() {
	Class1 c=new Class1();
	System.out.println(c.publicVariable);//Accessible
	//System.out.println(c.privateVariable);//Not Accessible outside class
	//System.out.println(c.protectedVariable);//Not Accessible outside other package without extending
	//System.out.println(c.defaultVariable);//Not Accessible outside package
}
}
