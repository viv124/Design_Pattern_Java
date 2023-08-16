public class Priv_University
{
     public Admission getAdmission(String course)
    {
        Admission ad=null;
        Switch(course)
        {
            case "Math":
                  ad=new Privateuni1(); //1st Private University
            break;

            case "Machine Learning":
                  ad=new Privateuni2(); //2nd Private University
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
                  fc=new Privateuni1(); //1st Private University
            break;

            case "Machine Learning":
                  fc=new Privateuni2(); //2nd Private University
            break;

            default:
            break;
        }
        return fc;
    }
}