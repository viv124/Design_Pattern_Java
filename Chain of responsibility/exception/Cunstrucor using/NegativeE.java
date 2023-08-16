public class NegativeE implements ExceptionD
{
    private ExceptionD e=null;
    public NegativeE(ExceptionD e)
    {
       this.e=e;
    }
    public void voting(int age)
    {
        if(age<0)
        {
            System.out.println("NEgative Exveption");
        }
        else
        {
            e.voting(age);
        }
    }
}