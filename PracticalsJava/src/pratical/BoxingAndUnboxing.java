// Write a program to demonstrate the concept of boxing and unboxing : program -12
package pratical;
public class BoxingAndUnboxing {
public static void main(String[] args) {
	//Boxing : converting primitive data type to wrapper object
	int num=21;
	@SuppressWarnings("removal")
	Integer boxNumber=new Integer(num);
	System.out.println("Boxing:"+boxNumber);
	
	//Unboxing : converting wrapper object to primitive data type 
	int unBoxNumber=boxNumber;
	System.out.println("unboxing:"+unBoxNumber);
}
}
