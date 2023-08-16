public class handle1 extends BaseHandler implements Handler
{
    Handler h;
    public  void setNext(Handler h)
     {
       this.h=h;  
     }
    public String process(String req)
    {
        String s=null;
        if(req.equals("handle1"))
        {
           s="Handle1 success";
        }
        else{
             super.setNext(h);
             s=super.process(req);
        }
        return s;
    }
}