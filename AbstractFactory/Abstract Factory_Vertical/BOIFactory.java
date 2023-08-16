public class BOIFactory extends AFactory
{
    public Home_Loan getHome(int a)
    {
        Home_Loan h=null;
        switch(a)
        {
            case 1:
              h=new BOIH();
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
              p=new BOIP();
              break;
            default:
              p=null;
              break;
        }
         return p;
    }
   
}