
public class ZeroException implements Handler
{
    private Handler h;
     String s=null;
    @Override
    public void setNext(Handler nextInChain) 
    {
        h = nextInChain;
    }

    @Override
    public String process(Number request)
    {
        if(request.getNo()==0)
        {
            s="Handle By Zero Exception";
        }
        else
        {
           // System.out.println("Not Handle By Zero Exception");
            s=h.process(request);
        }
        return s;
    }
    
}
