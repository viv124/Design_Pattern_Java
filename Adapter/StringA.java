public class StringA implements Value{
    private String Textnum;

    public void setValue(String Textnum)
    {
        this.Textnum=Textnum;
    }
    public String getValue() {
        return this.Textnum;
    }
}