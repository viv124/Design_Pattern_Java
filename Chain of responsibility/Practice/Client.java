public class Client 
{
    public static void main(String[] arjs)
    {
        Bank b=new Cash();
        Bank b1=new Check();
        Bank b2=new Gpay();
        b.setNext(b1);
        b1.setNext(b2);
        b.process(10);
        
    }
}