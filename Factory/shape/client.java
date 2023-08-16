import java.util.*;
public class client 
{
    public static void main(String[] args)
    {
        System.out.print("enter shape :");
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        shape a= Factoryshape.getInstance(n);
        System.out.println(a.draw());
    }
}