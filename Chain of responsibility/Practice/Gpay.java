public class Gpay extends Bank{
    String s;
    public void process(int amt)
    {
        if(amt>500)
        {
           System.out.println("Gpay Payment");
        }
        else
            b.process(amt);
     }
}