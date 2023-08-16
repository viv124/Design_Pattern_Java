public class Hp
{
    private static Hp h;
    private Hp()
    {

    }
    public static Hp getobj()
    {
        if(h==null)
        {
            h=new Hp();
        }
        return h;
    }
}