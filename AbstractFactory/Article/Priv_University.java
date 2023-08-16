public class Priv_University extends University
{
     public Admission getAdmission(String course)
    {
        Admission ad=null;
        switch(course)
        {
            case "Math":
                  ad=new Private_clgA(); //1st Private University
            break;

            case "Machine Learning":
                  ad=new Private_clgB(); //2nd Private University
            break;

            default:
                 ad=new Private_clgA();
            break;
        }
        return ad;
    }

    public FeesCal getFee(String course)
    {
        FeesCal fc=null;
        switch(course)
        {
            case "Math":
                  fc=new PrivateFeeA(); //1st Private University
            break;

            case "Machine Learning":
                  fc=new PrivateFeeB(); //2nd Private University
            break;

            default:
              fc=new PrivateFeeA();
            break;
        }
        return fc;
    }
}