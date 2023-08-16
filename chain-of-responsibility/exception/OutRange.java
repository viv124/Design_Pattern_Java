public class OutRange extends ExceptionD
{
    public void voting(int age)
    {
       if (age<0 || age>80)
       {
         System.out.println("Age Out of Range..");
       } 
       else
         System.out.println("Age approve to voting :"+age);
    }
}