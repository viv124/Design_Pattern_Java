public class Check extends Bank{
    String s;
    public void process(int amt)
    {
        if(amt<500)
        {
            System.out.println("Check Payment");
        }
        else
            b.process(amt);
    
       
    }
}