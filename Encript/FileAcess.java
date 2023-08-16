import java.io.*;

class FileAcess{
    public static void  main(String[] a1)throws IOException
    {
        B b=new B("admin");
        b.get("ahire.txt");
       // b.read();
        //System.out.println( b.write("Ahire  is Devloper"));
         System.out.println(b.delete());
    }
}