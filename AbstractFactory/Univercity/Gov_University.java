public class Gov_University
{
    public Admission getAdmission(String course)
    {
        Admission ad=null;
        Switch(course)
        {
            case "Math":
                  ad=new Govuni1(); //1st Goverment University
            break;

            case "Machine Learning":
                  ad=new Govuni2(); //2nd Goverment University
            break;

            default:
            break;
        }
        return ad;
    }

    public FeesCal getFee(String course)
    {
        FeesCal fc=null;
        Switch(course)
        {
            case "Math":
                  fc=new Govuni1(); //1st Goverment University
            break;

            case "Machine Learning":
                  fc=new Govuni2(); //2nd Goverment University
            break;

            default:
            break;
        }
        return fc;
    }
}