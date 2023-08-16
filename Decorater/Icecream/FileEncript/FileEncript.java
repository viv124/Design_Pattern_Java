import java.io.*;
public class FileEncript extends FileDecorator
{
    String s = "";

    InputStream its;
    public FileEncript(InputStream its)throws IOException,FileNotFoundException
    {
        super(its);
    }

    public int read()throws IOException,FileNotFoundException
    {

        int character;
        while ((character = super.read()) != -1) {
                    s += (char)character;
        } 
         byte[] strAsByteArray = input.getBytes();
  
        byte[] result = new byte[strAsByteArray.length];
  
        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
        return 1;
    }
      
   public String fileRead()throws IOException,FileNotFoundException{

        this.read();
        return s;
   }
}