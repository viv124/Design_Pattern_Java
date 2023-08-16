import java.io.*;
public abstract class FileDecorator extends InputStream
{
    InputStream its;
    public FileDecorator(InputStream its)throws IOException
    {
         this.its=its;
    }
    public int read() throws IOException
    { 
        return its.read();
    }
}