public class Zero implements ExceptionD
{
    private ExceptionD e=null;
    public Zero(ExceptionD e)
    {
       this.e=e;
    }
    public void voting(int age)
    {
        if(age==0)
        {
            System.out.println("Zero Exveption");
        }
        else
        {
            e.voting(age);
        }
    }
}