

public interface Handler
{
    public abstract void setNext(Handler nextInChain);
    public abstract String process(Number request);
}
