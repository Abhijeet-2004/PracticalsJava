//Accessing class (class1) from outside package
package package2;
import pratical.Class1;
public class SubClass1 extends Class1 {
	public void method() {
        System.out.println(publicVariable); // accessible
        System.out.println(protectedVariable); // accessible
       //System.out.println(defaultVariable); // not accessible from other package
        // System.out.println(privateVariable); // not accessible from outside class
    }
}
