public class SBIFactory extends AFactory
{
    public Home_Loan getHome(int a)
    {
        Home_Loan h=null;
        switch(a)
        {
            case 1:
              h=new SBIH();
              break;
            default:
              h=null;
              break;
        }
        return h;
    }

    public Personal_Loan getPersonal(int a)
    {
        Personal_Loan p=null;
        switch(a)
        {
            case 1:
              p=new SBIP();
              break;
            default:
              p=null;
              break;
        }
        return p;
    }
}