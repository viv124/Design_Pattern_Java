public class OutRange implements ExceptionD
{
    public void voting(int age)
    {
        if(age<18 && age>80)
        {
            System.out.println("OutRange Exveption");
        }
        else
        {
            System.out.println("Not handle");
        }
    }
}