/* Write a program that show working of different functions of String and String Buffer 
classes like setCharAt(), setLength(), append(), insert(), concat() and equals(). :Program-6*/
package pratical;
public class StringUse {
    public static void main(String[] args) {
        String str1="Ravenshaw";
        String str2="University";
        StringBuffer str3=new StringBuffer("Abhijeet");
        StringBuffer str4=new StringBuffer("Sahoo");
        StringBuffer str5=new StringBuffer("Abeijeet");


        //setCharAt() use
        System.out.println("Referened value of str5="+str5);
        str5.setCharAt(2,'h');
        System.out.println("After setting a charecter at specific index in str5="+str5);

        //setLength() use
        System.out.println("Lentgh of str3="+str3.length());
        str3.setLength(4);
        str5.setLength(4);
        System.out.println("After setting new length ,length of str3="+str3.length());

        //appened() use
        str4.append(str3);
        System.out.println("After appending new str4 referenced value is="+str4);

        //insert() use
        str4.insert(5,"Pupun");
        System.out.println(str4);

        //concat() use
        str1=str1.concat(str2);
        System.out.println("After concatination new str1 value is="+str1);
        
        //equals() use
        System.out.println(str1.equals(str2));
        System.out.println(str5.equals(str3));
        str1="Abhi";
        str2="Abhi";
        System.out.println(str1.equals(str2));
    }
}