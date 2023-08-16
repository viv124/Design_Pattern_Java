public class Gov_clgB implements Admission
{
   
    private int sid;
    public void setDetail(int sid)
    {
        this.sid=sid;
    }
    public String view()
    {
        return "Goverment college B \n Student id:"+sid;
    }
}