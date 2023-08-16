public class NegativeE extends ExceptionD
{
    String s=null;
     @Override
    public String voting(int age)
    {
       if (age<0)
       {
         s="Age is Negative Please enter age.";

       } 
       else
         s= e.voting(age);

          return s;
    }
   
}