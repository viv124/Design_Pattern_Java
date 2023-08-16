public abstract class Bank
{
    protected Bank b;
    public void setNext(Bank b)
    {
        this.b=b;
    }
    public abstract void process(int amt);
}