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
    // Annotate a method or class
    @MyAnno(str = "Annotation Example", val = 100)
    //@MyAnno(str = "Annotation Example 2", val = 200) //multiple values can be passed using @repeatable
    
    
    public static void myMeth()
    { 
        
    }
    public static void main(String args[])
    {
        Main ob = new Main();
        try 
        {
            // First, get a Class object that represents this class.
            Class c = ob.getClass();
            System.out.println(c);
            // OR Class c = Main.class; // with no ( )
            // Now, get a Method object that represents this method.
            Method m = c.getMethod("myMeth");
            // Next, get the annotation for this class.
            MyAnno anno = m.getAnnotation(MyAnno.class);
            // Finally, display the values. MyAnno is an interface
            System.out.println(anno.str() + " " + anno.val());
            
        }
        catch (NoSuchMethodException exc)
        { 
            System.out.println("Method Not Found."); }
}
}
