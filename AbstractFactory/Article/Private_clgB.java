public class Private_clgB implements Admission
{
   private int sid;
    public void setDetail(int sid)
    {
        this.sid=sid;
    }
    public String view()
    {
        return "Private college B \n Student id:"+sid;
    }
}