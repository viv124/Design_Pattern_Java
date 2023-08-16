public class Priv_University extends University
{
     public Admission getAdmission(String course)
    {
        Admission ad=null;
        switch(course)
        {
            case "Math":
                  ad=new Parul(); //1st Private University
            break;

            case "Machine Learning":
                  ad=new Nirma(); //2nd Private University
            break;

            default:
                 ad=new Nirma();
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
                  fc=new ParulFee(); //1st Private University
            break;

            case "Machine Learning":
                  fc=new NirmaFee(); //2nd Private University
            break;

            default:
              fc=new NirmaFee();
            break;
        }
        return fc;
    }
}