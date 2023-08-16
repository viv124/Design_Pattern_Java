 //program lazy Loading
public class Singleton 
{
    private static Singleton sg;
    private Singleton()
    {
           // private constructor
    }
    public static Singleton getobj()
    {
        if(sg==null)
        {
            synchronized(Singleton.class)
            {
                if(sg==null)
                {
                  sg=new Singleton(); //jo onj null hoy to 2 thread ek sathe n avi sake
                }
            }
            
        }
      return sg;
        
          
    }
    public void dis()
    {
        System.out.println("ahire vivek");
    }
}