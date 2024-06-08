//intro to wrapper classes 
class Main 
{
    public static void main (String[] a)//a is an array of strings 
    {
        System.out.println(a.length);
        System.out.println(a[0]);
        System.out.println(a[1]);
        //Integer is a wrapper class - wrapping the primitive int type of information is wrapped in this class (Encapsulation)
        // Base class for this class is Number class
        //public static int ParseInt(String s);
        int i = Integer.parseInt(a[0]);
        int j = Integer.parseInt(a[1]);
        System.out.println(i+j);
        //converting primitive type to wrapper class is boxing
    }
}
