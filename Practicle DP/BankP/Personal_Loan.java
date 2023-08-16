class Personal_Loan  implements Loan
{
	private float emi,rate,time;
	private double principalAmount;
	
	public void setData(double p,float r,float n)
	{
		principalAmount=p;
		rate=r;
		time=n;
	}
	public float loanEmi()//double p,float r,float n)
	{
		
		rate=rate/100/12;
		time=time*12;
		emi=(float)(principalAmount*rate*Math.pow(1+rate,time)) / (float)(Math.pow(1+rate,time)-1);
		
		return emi;
	}
}
