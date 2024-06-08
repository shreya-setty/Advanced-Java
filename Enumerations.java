public class Main
{
	enum color {RED,BLUE,GREEN}; //RED is a public static final member
	enum color2 
	{
	    Red(10), Blue(40), Green(60);
	    private int ctype; // instance variable
	    color2 (int p) 
	    { 
	        System.out.println(p); 
	        ctype=p; 
	    }
	    int getcolor() 
	    { 
	        return ctype; 
	    }
	}
	public static void main(String[] args) 
	{
	    
		color c = color.RED, d=color.BLUE;//creates an instance of color
		if ( c != d )
		System.out.println("c != d");
	    switch(c)
	    {
	        case RED: System.out.println("R selected"); break;
	        case GREEN: System.out.println("G selected"); break;
	        case BLUE: System.out.println("B selected"); break;
	    }
	    System.out.println(c.valueOf("BLUE"));//prints the value of the string passed
	    color d1[] = color.values();
	    for(color i : color.values() )
	        System.out.println(i);
	        
	    color2 c2 = color2.Red; /*normally calls the constructor but can be only called once because 
	    costructors are only initialized once*/
	    //System.out.println(color2.Red); //this is forced to call the constructor
	}
}
