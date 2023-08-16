import java.io.*;
import java.util.Scanner;
class ProxyFile implements FileInterface
{
    private String s,role;
         
    public ProxyFile(String s,String role)
    {
       this.s=s;
       this.role=role;
    }
    // void get(String role)
    // {
    //     this.role=role;
    // }
    public String read()throws IOException
    {
          String rd=null;
          if((role=="admin")||(role=="user")||(role=="guest"))
           {
             OriginalFile fo=new OriginalFile(s); 
              rd=fo.read();
           }
        return rd;
    }
    public String write(String text)throws IOException
    {
        String sw;
        if((role=="admin")||(role=="user"))
            {
      
               OriginalFile fo=new OriginalFile(s); 
                sw=fo.write(text);
            }
         else
            sw="You can NOT allow to Write Permission";
        return sw;
    }

    public String delete()throws IOException
    {
        String sd;
        if(role=="admin")
         {
               OriginalFile fo=new OriginalFile(s); 
                sd=fo.delete();
         }
        else
           sd="\nYou can Not delete"; 
        return sd;
    }

}