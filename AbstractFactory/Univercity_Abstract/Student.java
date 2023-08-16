import java.util.*;
public class Student
{
    public static void main(String []args)throws NullPointerException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter EntraseExam marks:");
        int cmat=sc.nextInt();

        System.out.println("Please Student Enter Id:");
        int id=sc.nextInt();
        
         System.out.println("Hello enter Your Name:");
         String name=sc.next();
        
        System.out.println("Enter Persentage:");
        float per=sc.nextFloat();
        

        University us=University.getInstance(cmat);

         System.out.println("Choise subject 1.Math  2.Machine Learning:");
         String sub=sc.next();
         Admission ad=us.getAdmission(sub);
      
        ad.setDetail(id,name,per);   // details store in database university wisec
        FeesCal fc=us.getFee(sub);
        System.out.println("University name :"+ad.view());
        System.out.println("Fees is :"+fc.feeCal());

    }
}