class Box 
{
    int height;
    int width;
    Box(int i, int j)
    {
        height = i;
        width = j;
    }
    public String toString()
    {
        return "height is " + height + " width is " + width;
    }
}
public class Main
{
	public static void main(String[] args) 
	{
		Box b = new Box(10,20);
		String s1 = new String("Box "+b);
		System.out.println(s1);
		String s2 = "Setty";
		System.out.println(s2.charAt(2));
		char[] a = new char[5];
		s2.getChars(1,3,a,0);
		System.out.println(a);
		String s3 = "SHreYA";
		String s4 = "shreya";
		System.out.println(s3.equalsIgnoreCase(s4));
	}
}
