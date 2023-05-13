//Accessing class (Class1) from same package
package pratical;
public class Class2 extends Class1{
	public void method() {
        System.out.println(publicVariable); // accessible
        System.out.println(protectedVariable); // accessible
        System.out.println(defaultVariable); //  accessible 
        // System.out.println(privateVariable); // not accessible from outside class
    }
}
