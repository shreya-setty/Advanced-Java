import java.lang.reflect.Field;
class num
{
    public int a,b;
}
class complex extends num
{
    public int c,d;
}
public class Main
{
	public static void main(String[] args) {
		Class c = (new complex().getClass());
		Field f[] = c.getFields();
	    if (f.length != 0)
		 for(Field i : f)
		   System.out.println(i);
		else
		  System.out.println("Array is empty");
	}
}
