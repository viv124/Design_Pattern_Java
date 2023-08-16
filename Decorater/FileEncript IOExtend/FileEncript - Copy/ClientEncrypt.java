import java.io.*;
import java.util.Scanner; 
class ClientEncrypt
{
    public static void main(String[] args)throws Exception
    {
        
        FileEncript fn=new FileEncript(new FileInputStream("viv1.txt"));
        fn.getKey(5);
        System.out.println(fn.encript("viv1.txt"));
      
   }
}