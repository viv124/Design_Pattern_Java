public interface Admission
{
    public void setDetail(int id,String name,float percentage);
    public void setDetail(int id,float percentage);
    public void setDetail(int id,String name,float percentage,int mobno);
    public String view();
}