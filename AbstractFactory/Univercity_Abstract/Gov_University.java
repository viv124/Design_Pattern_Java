public class Gov_University extends University
{
    public Admission getAdmission(String course)
    {
        Admission ad=null;
        switch(course)
        {
            case "Math":
                  ad=new MSU(); //1st Goverment University
            break;

            case "Machine Learning":
                  ad=new GVP(); //2nd Goverment University
            break;

            default:
                  ad=new GVP();
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
                  fc=new MSUFee(); //1st Goverment University
            break;

            case "Machine Learning":
                  fc=new GVPFee(); //2nd Goverment University
            break;

            default:
                   fc=new GVPFee();
            break;
        }
        return fc;
    }
}