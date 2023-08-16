public abstract class AFactory
{
    public static AFactory getinstance(int a)
    {
        AFactory b;
        switch(a)
        {
            case 1:
            b=new SBIFactory();
            break;
            case 2:
            b=new BOIFactory();
            break;
            default:
            b=new SBIFactory();
        }
        return b;
    }
     public abstract Home_Loan getHome(int a);
     public abstract Personal_Loan getPersonal(int a);
}