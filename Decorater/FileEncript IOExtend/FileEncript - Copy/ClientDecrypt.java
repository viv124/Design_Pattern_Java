import java.io.*;
import java.util.Scanner; 
class ClientDecrypt
{
    public static void main(String[] args)throws Exception
    {
        
        FileDecript fn=new FileDecript(new FileInputStream("viv1.txt"));
        fn.getKey(5);
        System.out.println(fn.decript("viv1.txt"));
    }
}
      