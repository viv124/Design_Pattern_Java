public class BOIP implements Personal_Loan
{
    private float r,n;
    private double p;
    public void setData(double p,float r,float n)
    {
        this.p=p;
        this.r=r/100/12;  //(9/100/12) //9%
        this.n=n*12;
    }
     public double pLoan()
     {
        float a1= (float)(p*r*Math.pow((r+1),n))/(float)(Math.pow((1+r),n)-1) ; // EMI method find
       return a1; 
     }
     public String disP()
    {
        return ("BOI Personal loan");
    }
}