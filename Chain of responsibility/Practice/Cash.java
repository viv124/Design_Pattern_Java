public class Cash extends Bank{
    
    public void process(int amt)
    {
        if(amt<100)
        {
            System.out.println("Cash Payment");
        }
        else
            b.process(amt);
    
        
    }
}