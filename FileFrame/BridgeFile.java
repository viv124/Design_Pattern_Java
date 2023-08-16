import java.io.*;

class BridgeFile extends FileOpr
{
    String role;
    
    public BridgeFile(String role)
    {
       this.role=role;
    }

    void get(String s)throws IOException
    {
        super.get(s);
    }

    void read()throws IOException
    {
        if((role=="admin")||(role=="user")||(role=="guest"))
            super.read();
    }

    String write(String text)throws IOException
    {
        String sw;

        if((role=="admin")||(role=="user"))
            sw=super.write(text);
         else
            sw="You can NOT allow to Write Permission";
        return sw;
    }

    String delete()
    {
        String sd;;
        if(role=="admin")
           sd=super.delete();
        else
           sd="\nYou can Not delete"; 
        return sd;
    }

}