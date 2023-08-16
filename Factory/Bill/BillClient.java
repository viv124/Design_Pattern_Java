import java.util.*;
public class BillClient
{
    public static void main(String[] args)
    {
          System.out.print("Enter Generate city Bill :");
          Scanner sc=new Scanner(System.in);
          String a=sc.next();
          System.out.print("Enter Bill Unit :");
          double d=sc.nextDouble();
          Bill obj=FactoryBill.getInstance(a);
          System.out.println(obj.getRate());
          System.out.println(obj.calculateBill(d));
    }
}