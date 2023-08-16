public class client
{
    public static void main(String[] args)
    {
        handle1 h=new handle1();
        handle2 h2=new handle2();
        BaseHandler bh=new BaseHandler();
        System.out.println(h2.process("BaseHandle"));
        // h2.setNext(h);
        // h.setNext(bh);
        
    }
}