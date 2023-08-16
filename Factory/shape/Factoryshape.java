
public class Factoryshape
{
    public static shape getInstance(String n)
    {
        shape s1;
      
        switch(n)
        {
             case "circle":
                 s1=new circle();
                 break;
            case "rec":
                s1=new rectangle();
                break;
            default:
                 s1=new rectangle();
        }
        return s1;
        
    }

}