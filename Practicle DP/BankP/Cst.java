import java.util.Scanner;

class Cst
{
	public static void main(String [] args)	
	{
		int cn;
		double p;
		float r;
		float time;
		double emi;
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("1.Home\n2.Education\n3.Pesonal");
		
		cn=sc.nextInt();
		
		//get instance 
		Loan l1=LFactory.getInstance(cn);
		
		if (l1!=null)
		{
			System.out.print("\nEnter Amount :- ");
			p=sc.nextDouble();
					
			System.out.print("\nEnter Year :- ");
			time=sc.nextFloat();
			System.out.print("\nEnter rate :- ");
			r=sc.nextFloat();
			
			//Set Data Member
			l1.setData(p,r,time);
			
			//Calcuate Lone Intres
			emi=l1.loanEmi();
			
			System.out.println("Monthly EMI is "+emi);
		}
		else
		{
			System.out.println("\"Wrong Choice\" ");
		}
	}
}
