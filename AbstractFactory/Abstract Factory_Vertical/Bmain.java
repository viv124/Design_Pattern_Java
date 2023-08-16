import java.util.*;
public class Bmain
{
    public static void main(String[] a)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("1. SBIFactory   2.BOIFactory ");
        int f=s.nextInt();
        AFactory b=AFactory.getinstance(f);

        System.out.println("1. Home loan   2. Personal loan ");
        int ch=s.nextInt();

        System.out.print("Enter Principle Amount :");
        double p=s.nextDouble();

        System.out.print("Enter Time perioud in (Year) :");
        float n=s.nextFloat();

        System.out.print("Enter Rate :");
        float r=s.nextFloat();
        if(f==1)
        {
            Home_Loan h1=b.getHome(1);
            h1.setData(p,r,n);
            System.out.println("Interest is :"+(int)h1.homeLoan());
            System.out.println(h1.disH());
        }
        else
        {
            Personal_Loan p1=b.getPersonal(1);
             p1.setData(p,r,n);
             System.out.println("Interest is :"+(int)p1.pLoan());
             System.out.println(p1.disP());
        }
        
    }
}