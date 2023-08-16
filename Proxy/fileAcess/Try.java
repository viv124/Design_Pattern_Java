import java.io.*;
public class Try {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception
    {
        FileReader fr=new FileReader(new File("viv.txt"));
        BufferedReader br=new BufferedReader(fr);
        String as=br.readLine();
        while(as!=null)
        {
            System.out.print(as);
           as= br.readLine();
        }
        
    }
    
}