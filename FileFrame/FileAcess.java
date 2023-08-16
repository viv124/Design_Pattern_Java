import java.io.*;
class FileAcess{
    public static void  main(String[] a1)throws IOException
    {
        BridgeFile b=new BridgeFile("user");
        b.get("ahire1.txt");
        b.read();
        System.out.println( b.write("Hello vivek\nToday lecture Design pattern"));
        System.out.println(b.delete());
    }
}