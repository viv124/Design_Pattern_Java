public class MSU implements Admission
{
    private int id,mobno;
    private String name;
    private float percentage;
    public void setDetail(int id,float percentage)
    {
        this.id=id;
        this.percentage=percentage;
        
    }
    public void setDetail(int id,String name,float percentage)
    {
         this.id=id;
         this.name=name;
         this.percentage=percentage;
         
    }
    public void setDetail(int id,String name,float percentage,int mobno)
    {
         this.id=id;
         this.name=name;
         this.percentage=percentage;
         this.mobno=mobno;
        
    }
     public String view()
    {
        return "MSU  Goverment University";
    }
}