public class StringAdapter implements IntegerNumber{
    private Value Textnum;

    public StringAdapter(Value Textnum)
    {
        this.Textnum = Textnum;

    }
    public int getInt()
    {
        String a1=this.Textnum.getValue();
        char[] a=a1.toCharArray();
        int n=0;
        for (int i = 0; i < a.length; i++)
        {
            n=n*10+(a[i]-48);
        }
        return n;
    }
}