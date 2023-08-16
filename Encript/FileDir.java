import java.io.*;
import java.util.*;
public class FileDir 
{
    public static void main(String []args)
    {
        File f =new File("viv1.txt");
        if(f.isFile())
        {
            System.out.println("File Name is:" + f.getName());
            System.out.println("File length is: " +f.length());
        }
        else
        {
            System.out.println("vivek");
        }
        }  
        
 }
