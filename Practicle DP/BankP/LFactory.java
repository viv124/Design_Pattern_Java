class LFactory
{
	public static Loan getInstance(int n)
	{ 
		Loan ob;
		int ch=n;
		switch (ch)
		{
		 case 1:
		 	ob = new Home_Loan();
		 	break;
		 	
		 case 2:
		 	ob = new Educational();
		 	break;
		 case 3:
		 	ob=new Personal_Loan();
		 	break;
		 default:
		 	ob = null;
		 	
		 	break;	 
		}
	return ob;
	}
	
	
	
}
