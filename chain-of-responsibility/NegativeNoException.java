
public class NegativeNoException implements Handler
{
    Handler h;
    String s;
    @Override
    public void setNext(Handler nextInChain)
    {
        h = nextInChain;
    }

    @Override
    public String process(Number request)
    {
        if(request.getNo()<0)
        {
            s="Handle By NegativeNo Exception";
        }
        else
        {
           // s="Not Handle By NegativeNo Exception";
           s= h.process(request);
        }
        return s;
    }
    
}
