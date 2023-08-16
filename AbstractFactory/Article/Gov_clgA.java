public class Gov_clgA implements Admission
{
    private int sid;
    public void setDetail(int sid)
    {
        this.sid=sid;
    }
    public String view()
    {
        return "Goverment college A \n Student id:"+sid;
    }
}