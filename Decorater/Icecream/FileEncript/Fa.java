import java.io.*;
class Fa
{
    public static void main(String[] args)throws Exception
    {
        // File file = new File("viv1.txt");
      FileEncript fn=new FileEncript(new FileInputStream("E:\\DesignPattern\\Decorater\\Icecream\\FileEncript\\viv1.txt"));
       System.out.println(fn.fileRead());
    }
}