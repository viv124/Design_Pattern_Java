public class NoOutOfRangeException implements Handler
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
        int x = request.getNo();
        if((request.getNo()<11))
        {
            s=" Handle by no out of range exception";
        }
        else
        {
            s=" not handle by character exception";
        }
        return s;
    }
}
