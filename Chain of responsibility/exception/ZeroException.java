public class ZeroException extends ExceptionD
{
    String s=null;
    @Override
    public String voting(int age)
    {
       if (age==0)
       {
         s="Age is Not Zero ! hey please enter Proper Age..";
       } 
       else
          s=e.voting(age);

           return s;
       }
   
}