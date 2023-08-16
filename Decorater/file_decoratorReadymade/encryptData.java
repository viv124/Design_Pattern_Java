import java.util.*;
public class encryptData extends SourceDecorator
{
    public encryptData()
    {}
    public encryptData(Abstract_File s)
    {
        super(s);
    }

    public void writeData(String data)
    {
        super.writeData(encode(data));
    }

    public String readData() 
    {
        return decode(super.readData());
    }
    
    public String encode(String data)
    {
        return Base64.getEncoder().encodeToString(data.getBytes());
    }

    public String decode(String data) 
    {
        Base64.Decoder decode = Base64.getMimeDecoder();
        String str = new String(decode.decode(data));
        return str;
        
    }
    
}