public class Client 
{
    public static void main(String[] s)
    {
        Context c=new Context(new Sub());
        System.out.print(c.exe(5,2));
    }
}