class Complex
{
    private float r,i;
    public Complex(float r,float i)
    {
        this.r = r;
        this.i = i;
    }
    @Override
    public String toString()
    {
        String t = r+" +i"+i;
        System.out.println(r+" +i"+i);
        return t;
    }
    public boolean equals(Object obj)//instance level function because there is no static keyword
    {
        //obj is a base class reference so if(r==obj.r) will not work
        //obj is pointing to c2
        Complex t = (Complex)obj;
        if (r == t.r)
            return true;
        else 
            return false;
            
    }
}
class Main 
{
    public static void main (String[] args) 
    {
        Complex c1 = new Complex(1,2);
        Complex c2 = new Complex(1,2);//or Complex c2 = c1;
        if(c1.equals(c2))//this calls an object of c2 which is passed in equals function
            System.out.println("Objects are equal");
        c1.toString();
    }
}
