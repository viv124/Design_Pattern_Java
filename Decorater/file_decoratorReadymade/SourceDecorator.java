public abstract class SourceDecorator implements Abstract_File
{
    protected  Abstract_File sd;
    public SourceDecorator()
    {
        
    }
    public SourceDecorator(Abstract_File s)
    {
        this.sd=s;
    }
    

    public void writeData(String data) {
        sd.writeData(data);
    }

    public String readData() {
        return sd.readData();
    }
    
}