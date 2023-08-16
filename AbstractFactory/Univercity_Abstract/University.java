/* this class abstact class and also AbstactFactory class */

public abstract class University
{
     private static int cutoff=100;
     public static University getInstance(int score)
     {
        University uobj=null;

        if(score>cutoff)
        {
             uobj=new Gov_University(); //Goverment University
        }
        else
        {
            uobj=new Priv_University(); //Private University
        }
        return uobj;
     }
    
    // this method override in Factory class
    public abstract Admission getAdmission(String course);
    public abstract FeesCal getFee(String course);

}