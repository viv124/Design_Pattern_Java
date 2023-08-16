import java.io.*;
import java.util.*;

public class FileData implements Abstract_File
{
    private String name;

    public FileData(String name) {
        this.name = name;
    }

    public void writeData(String data)
    {
        
        try 
        {
            FileWriter fw = new FileWriter(name);
            fw.write(data);
            fw.close();

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }


    public String readData()
    {
        char[] buffer = null;
        try 
        {
            File file = new File(name);
            FileReader reader = new FileReader(file);
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } 
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return new String(buffer);
    }
    
}

   
    