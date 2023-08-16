
public class client
{
    public static void main(String[] args)
    {
        Value userstring=new StringA();
        userstring.setValue("123");
        IntegerNumber Covertint=new StringAdapter(userstring);
        int a=Covertint.getInt();
        System.out.println(a);
    }
}