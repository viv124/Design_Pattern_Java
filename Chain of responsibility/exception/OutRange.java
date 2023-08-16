public class OutRange extends ExceptionD
{
     String s=null;
     @Override
    public String voting(int age)
    {
       if (age<18 || age>80)
       {
         s="Age Out of Range..";
       } 
       else
         s="Age approve to voting :"+age;

         return s;
    }
    
}