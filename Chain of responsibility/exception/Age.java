public class Age extends ExceptionD
{
     String s=null;
    @Override
    public String voting(int age)
    {
       if (age<18)
       {
         s="Age is 18 <Please enter age.";

       } 
       else
          s=e.voting(age);
       return s;
       }
}