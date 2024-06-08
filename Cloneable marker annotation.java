//Cloneable is an interface in java which is an example of marker annotation
class student implements Cloneable
{
    String name,usn;
    public student(){}
    public student(String n, String u)
    { name = n; usn = u; }
    
    public void display()
    {
        System.out.println(name+ " " + usn);
    }
    @Override
    public Object clone() throws CloneNotSupportedException
    {
       return super.clone(); // performs shallow copy
        
        /* //Deep copy ???
        student t = new student();
        t.name = name;
        t.usn = usn;
        
        return t;*/
    }
}
public class Main
{
	public static void main(String[] args) {
	   student s = new student("aaa","123"); 
	   student p = null;
	   try{
	       p = (student) s.clone();
	   }
	   catch(Exception e)
	   { System.out.println("Exceptoin generated"); }
	   
	   if (s == p) 
	     System.out.println(true);
	   System.out.println(s.hashCode());
	   System.out.println(p.hashCode());
	   p.display();
	}
}
