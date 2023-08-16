public class Context
{
    private Statergy s;
    public Context(Statergy s)
    {
        this.s=s;
    }
    public int exe(int m,int n)
    {
        return s.cal(m,n);
    }
}