public class Department implements Dept
{
    private String info,name;
    public Department(String name)
    {
       this.name=name;
    }
    public void update(String info)
    {
        System.out.println(info);
    }
    public String getInfo()
    {
       return this.info;
    }
    public void setInfo(String info)
    {
        this.info=info;
    }
}