import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Mahadev_sankul 
{
    private String info;
    List<Dept> dept=new ArrayList<>();
    public void addObserver(Dept d)
    {
        this.dept.add(d);
    }
    public void removeObserver(Dept d)
    {
        this.dept.remove(d);
    }
    public void setInfo(String info)
    {
           this.info=info;
           notify1();
        //    for(Dept d:this.dept)
        //    {
        //        d.update(this.info);
        //    }
    }
    private void notify1()
    {
         for(Dept d:this.dept)
           {
               d.update(this.info);
           }
    }
}