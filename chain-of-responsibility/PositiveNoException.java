
public class PositiveNoException implements Handler
{
    Handler h;
    String s=null;
    @Override
    public void setNext(Handler nextInChain)
    {
        h = nextInChain;
    }

    @Override
    public String process(Number request)
    {
        if(request.getNo()>0)
        {
            s="Handle By PositiveNo Exception";
        }
        else
        {
            //System.out.println("Not Handle By PositiveNo Exception");
           s=h.process(request);
        }
        return s;
    }
    
}
