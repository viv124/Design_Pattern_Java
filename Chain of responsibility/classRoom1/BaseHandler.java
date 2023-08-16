public class BaseHandler implements Handler
{
    Handler h;
     public  void setNext(Handler h)
     {
       this.h=h;
     }
    public String process(String req)
    {
        String s=null;
        if(req.equals("BaseHandle"))
        {
           s="BaseHandle success";
        }
        else{
             s="Not handled process";
        }
        return s;
    }
}