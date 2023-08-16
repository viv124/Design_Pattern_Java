import java.io.*;
class FileAcess{
    public static void  main(String[] a1)throws IOException
    {
        FileInterface b=new ProxyFile("ahire1.txt","admin");//1.file name 2.Role
              // System.out.println(b.read());
        //System.out.println( b.write("Hello vivek\nToday lecture Design pattern...."));
       System.out.println(b.delete());
    }
}