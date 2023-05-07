/* Modify the– “distance” class by creating constructor for assigning values (feet and 
inches) to the distance object. Create another object and assign second object as 
reference variable to another object reference variable. Further create a third object 
which is a clone of the first object. Program-8 */
package pratical;
class Distance1{
	private int feet;
	private int inch;
	public Distance1() {
		feet=0;
		inch=0;
	}
	public Distance1(int feet,int inch) {
		this.feet=feet;
		this.inch=inch;
	}
	public Distance1(Distance1 d) {
		this.feet=d.feet;
		this.inch=d.inch;
	}
	public void showDistance() {
		System.out.println(feet+" feet "+inch+" inches");
	}

}
public class DistanceClassUse1 {
public static void main(String[] args) {
	Distance1 d1=new Distance1(3,4);
	Distance1 d2=new Distance1(d1);//cloning of first object
	Distance1 d3=d1;//It is the reference variable of first object
	System.out.print("Distance(1)=");
	d1.showDistance();
	System.out.print("\nDistance(2)=");
	d2.showDistance();
	System.out.print("\nDistance(3)=");
	d3.showDistance();	
}
}
