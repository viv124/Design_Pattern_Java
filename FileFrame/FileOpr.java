import java.io.*;

public class FileOpr{
    
    File f;
    void get(String s)throws IOException
    {
      f=new File(s);
      
    }
    void read()throws IOException
    {
         if(f.isFile())
          {
            FileInputStream fl = new FileInputStream(f);
            int i=0;    
             while((i=fl.read())!=-1){    
                System.out.print((char)i);    
            } 
          }
         else
         {
            System.out.println("File is not be Exists");
         }
    }

    String write(String text)throws IOException
    {
        String sw=null;
        FileWriter fw = new FileWriter(f);
        fw.write(text);
        if(f.isFile()) 
            sw="\nSuccesfully write";
        else
        {
            if (f.createNewFile());
            sw="File is new created";
        }
        fw.close();
        return sw;
    }

    String delete()
    {
        String sd=null;
        if(f.isFile())
         {
            f.delete();
            sd="Succesfully delete file";
         }
         else
             sd="please check file exist or not";
      
         return sd;
    }
}