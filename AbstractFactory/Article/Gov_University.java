public class Gov_University extends University
{
    public Admission getAdmission(String course)
    {
        Admission ad=null;
        switch(course)
        {
            case "Math":
                  ad=new Gov_clgA(); //1st Goverment University
            break;

            case "Machine Learning":
                  ad=new Gov_clgB(); //2nd Goverment University
            break;

            default:
                  ad=new Gov_clgA();
            break;
        }
        return ad;
    }

    public FeesCal getFee(String course)throws NullPointerException
    {
        FeesCal fc=null;
        switch(course)
        {
            case "Math":
                  fc=new GovFeeA(); //1st Goverment University
            break;

            case "Machine Learning":
                  fc=new GovFeeB(); //2nd Goverment University
            break;

            default:
                   fc=new GovFeeA();
            break;
        }
        return fc;
    }
}