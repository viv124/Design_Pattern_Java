import java.util.Scanner;
class Bank_demo
{
    public static void main(String args[])
    {
        try
        {

        System.out.println("\n1.home loan");
        System.out.println("2.personal loan");
        System.out.println("3.vehicle loan");
        Scanner sc=new Scanner(System.in);
        System.out.println("select which type of loan");
        int ch=sc.nextInt();
        System.out.print("enter amount : ");
        double amt=sc.nextDouble();
        System.out.print("enter Rate : ");
        float r=sc.nextFloat();
        System.out.print("enter number of  year : ");
        float n=sc.nextFloat();

        Loan b1=Lfactory.getInstance(ch);
        b1.setData(amt,r,n);
        System.out.println("\n ................................\n");
        System.out.println("Loan type is :"+b1.loanType());
  
        System.out.println("total EMI :"+b1.loanEmi());
        System.out.println("Loan class name is :"+b1.getClass());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}