import java.lang.annotation.*;
import java.lang.reflect.*;
// An annotation type declaration.
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno 
{
    String str();

int val();
}
class Main {
// Annotate a method.
@MyAnno(str = "Annotation Example", val = 100)
public static void myMeth(String str, int i)
{ }
public static void main(String args[])
{
Main ob = new Main();
// Obtain the annotation for this method
// and display the values of the members.
try {
    // First, get a Class object that represents this class.
Class c = Main.class;
// Now, get a Method object that represents this method.
Method m = c.getMethod("myMeth", String.class, int.class);
/* to obtain a method that has parameters, class objects must be specified
6
representing the types of those parameters as arguments.
Class c = int.class;
System.out.println(c.isPrimitive()); //true
*/
// Next, get the annotation for this class.
MyAnno anno = m.getAnnotation(MyAnno.class);
// Finally, display the values.
System.out.println(anno.str() + " " + anno.val());
}
catch (NoSuchMethodException exc)
{ System.out.println("Method Not Found."); }
}
}
