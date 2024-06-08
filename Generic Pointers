class Person
{
    private String name , aadno;
    private static int cnt;
    public Person()
    {
        System.out.println("Person: in Zero parameter constructor");//zero parameter constructor
        cnt++;
    }
    public Person(String name, String aadno)
    {
        this.name = name; // = operator is overloaded to pass information
        this.aadno = aadno;
        cnt++; //intention of incrementing cnt value is to count the instances of type Person
    }
    public Person(String name)
    {
        this(name,null); //invokes or calls the 2PC, eliminates usage of this. again
    }
    public String toString()
    {
        String t = super.toString();
        t = name + " " + aadno;
        System.out.println("Number of objects created "+cnt);
        return t;
    }
}
class Student extends Person
{
    private float marks;
    public Student()
    {
        System.out.println("Student in zero parameter constructor");
    }
    public Student(String name, String aadno)
    {
        super(name,aadno);
        System.out.println("Student in parameter constructor");
    }
    public Student(String name)
    {
        this(name,null);
    }
    @Override
    public String toString()
    {
        System.out.println("Student in toString");
        String t;
        t = super.toString();
        t = t+" "+marks;
        return t;
    }
}
class GenericPointer
{
    public static void main(String[] args)
    {
        Student s = new Student("abc");
        System.out.println(s);
        System.out.println(s.getClass());
        //System.out.println(s.toString());
        Person p = new Person("aaa","123");//generic reference in class heirarchy
        System.out.println(p);
        p = s;
        System.out.println(p.getClass());
    }
}
