public class COR 
{

    public static void main(String[] args) 
    {
        Handler h2 = new NegativeNoException();
        Handler h1 = new ZeroException();
        Handler h4 = new PositiveNoException();
        Handler h3 = new NoOutOfRangeException();
        
        h1.setNext(h2);
        h2.setNext(h3);
        h3.setNext(h4);
        
        Number num = new Number();
        num.setNo(-10);
        System.out.println(h1.process(num));
    }
    
}
