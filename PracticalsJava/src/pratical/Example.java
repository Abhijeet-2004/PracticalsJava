/* Write a program to show the difference between public and private access 
specifiers. The program should also show that primitive data types are passed by 
value and objects are passed by reference and to learn use of final keyword Program-10 */
package pratical;
class Access{
	
	@SuppressWarnings("unused")
	private int priData;
	public int pubData;
	
	Access(){
		priData=2;
		pubData=3;
	}
	public void pubMethod() {
		System.out.println("This is public method");
	}
	@SuppressWarnings("unused")
	private void priMethod() {
		System.out.println("This is private method");
	}
	public void modifyPremitive(int value) {
		value=20;
	}
	public void modifyObject(Access o) {
		o.pubData=30;
	}
}
public class Example {
public static void main(String[] args) {
	Access obj=new Access();
	
	//public data member and methods are accessible
	System.out.println("Accessing public data member="+obj.pubData);
	obj.pubMethod();
	
	//Private data member and methods are not accessible : compilation error
	//System.out.println("Accessing public data member="+obj.priData);
	//obj.priMethod();
	
	int number=10;
	System.out.println("Before method call");
	System.out.println("Number is="+number);
	System.out.println("Value at pubData="+obj.pubData);
	obj.modifyPremitive(number);
	obj.modifyObject(obj);
	System.out.println("After method call");
	System.out.println("Number is="+number);
	System.out.println("Value at pubData="+obj.pubData);
	
	
	
	final int finalVariable=20;
	System.out.println("Final variable value:"+finalVariable);
	// final local variable cannot be re assigned : compilation error
	// finalVariable=30;
}
}
