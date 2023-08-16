public class FactoryBill
{
    public static Bill getInstance(String s)
    {
        Bill b;
        switch(s)
        {
            case "Surat":
                 b=new Surat();
            break;
            case "Valsad":
                 b=new Valsad();
            break;
            default:
                b=new Surat();
        }
        return b;
    }
}