public interface Handler
{
    public  void setNext(Handler h);
    public String process(String req);
}