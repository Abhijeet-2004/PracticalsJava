/*Write a program to create a – “distance” class with methods where distance is 
compute din terms of feet and inches, how to create objects of a class and to see the 
use of this pointer;  Program-7 */
package pratical;
class Distance{
	private int feet;
	private int inch;
	public void setData(int feet,int inch) {
		this.feet=feet;
		this.inch=inch;
	}
	public void showDistance() {
		System.out.println(feet+" feet "+inch+" inches");
	}
	public Distance addDistance(Distance d) {
		Distance res=new Distance();
		res.feet=this.feet+d.feet;
		res.inch=this.inch+d.inch;
		if(res.inch>=12)
		{
			res.feet++;
			res.inch-=12;
		}
		return res;
	}
}
public class DistanceClassUse {
public static void main(String[] args) {
	Distance d1=new Distance();
	Distance d2=new Distance();
	d1.setData(5,6);
	d2.setData(6,10);
	Distance d3=d1.addDistance(d2);
	System.out.print("Distance 1=");
	d1.showDistance();
	System.out.print("\nDistance 2=");
	d2.showDistance();
	System.out.print("\nDistance 3=");
	d3.showDistance();	
}
}
