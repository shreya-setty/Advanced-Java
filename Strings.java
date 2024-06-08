//String is created as an object in java so that you can implement functions on it
//immutable. On modificaition, new memory is allocated
//if two objects/strings hold the same value, it automatically points to the same location
//cannot modify string but you can change the reference(name of the object)
//saves heap memory, thread safe, security for data
//concatenation is done with plus symbol
//can concatenate with integer too, the integer is implicitly typecasted to a string
import java.lang.String;
public class Main
{
	public static void main(String[] args) 
	{
	    String s = "Shreya";
	    String s1 = new String();
	    s1 = "Setty";
	    System.out.println(s+" "+s1);
	    char[] a = {'a','b','c','d','e','f'};
	    String abc = new String(a);
	    System.out.println(abc);
	    String abc1 = new String(a,1,3);//1 is from where the string should start printing and 3 is where it should end
	    System.out.println(abc1);
	    String abc2 = new String(abc);//copy strings
	    System.out.println(abc2);
	    System.out.println(abc.length());//String length is an inbuilt function
	    System.out.println("Shreya".length());
	    System.out.println(abc2.concat(abc1));//or abc2+abc1
	    System.out.println("for "+2+2);
	    System.out.println("for "+(2+2));
	    System.out.println(2+2+" for");
	    String shreya = String.valueOf(55);
	    System.out.println(shreya);
	    
	}
}
