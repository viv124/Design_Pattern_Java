import java.util.*;
public class Student
{
    public static void main(String []args)throws NullPointerException
    {

        University us=University.getInstance(199);//Enter Entrace Marks

        //Choise subject 1.Math  2.Machine Learning"
         Admission ad=us.getAdmission("Machine Learning");
      
        ad.setDetail(19);   //Enter Student id
        FeesCal fc=us.getFee("Machine Learning");//subject wise return fee
        System.out.println("University name :"+ad.view());
        System.out.println("Fees is :"+fc.feeCal());

    }
}