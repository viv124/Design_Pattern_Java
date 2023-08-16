public class voter
{
    public static void main(String[] args)
    {
        ExceptionD e1=new ZeroException();
        ExceptionD e2=new NegativeE();
        ExceptionD e3=new Age();
        ExceptionD e4=new OutRange();
        
        e1.setNext(e2);
        e2.setNext(e3);
        e3.setNext(e4);
        e1.voting(22); //200/0
    }
}