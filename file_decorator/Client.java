import java.util.*;
public class Client
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		encryptData ed = new encryptData(new FileData("file.txt"));
		ed.writeData("Ahire vivek");
		System.out.println(ed.readData());
		
	}
}