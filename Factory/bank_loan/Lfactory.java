public class Lfactory
{
    public static Loan getInstance(int n){

    Loan b1=null;
    switch(n)
        {
            case 1:
            b1=new Home_loan();
            break;
            case 2:
            b1=new Personal_loan();
            break;
            case 3:
            b1=new Vehicle_loan();
            break;
            default:
            break;
        }
        return b1;
}
}