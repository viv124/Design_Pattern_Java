public class handle2 extends handle1 implements Handler
{
    Handler h;
    public  void setNext(Handler h)
     {
         this.h=h;
        
     }
    public String process(String req)
    {
        String s=null;
        String re=req;
        if(req.equals("handle2"))
        {
           s="Handle2 success";
        }
        else{
             
             //super.setNext(h);
             s=super.process(re);
        }
        return s;
    }
}