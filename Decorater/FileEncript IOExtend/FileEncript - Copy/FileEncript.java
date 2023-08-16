import java.io.*;
public class FileEncript extends FileDecorator
{
    String s = "";

    InputStream its;
    int key;
    public FileEncript(InputStream its)throws IOException,FileNotFoundException
    {
        super(its);

    }
    public void getKey(int key){
        this.key=key;
    }

    public String encript(String n)throws IOException,FileNotFoundException
    {
        char []ver={'a','e','i','o','u'};
        char []rep={'/','*','-','+','.'};
        String all="";
        int i=0;
        
        char o;
        while((i=super.read())!=-1)
        {   
            int flag=0;
            o=(char)i;
            for(int j=0;j<5;j++)
            {
                if(ver[j]==o)
                {
                    all+=rep[j];
                    flag=1;
                    
                }
            }
            if (flag==0)
                all+=(char)i;
        }
        //System.out.println(all);
        StringBuilder sb=new StringBuilder();
        sb.append(all);
        String rev=new String(sb.reverse());
       // System.out.println(rev);
        char c[]=rev.toCharArray();
        String ec="";
        for(char c1:c)
        {
           // System.out.print(" "+(char)(c1-key));
            ec+=(char)(c1-key);
        }
           // System.out.println(ec);
           FileWriter fw=new FileWriter(n);
            fw.write(ec);
            fw.close();
            s=ec;
            return "Success encript";
    }
   
  
}