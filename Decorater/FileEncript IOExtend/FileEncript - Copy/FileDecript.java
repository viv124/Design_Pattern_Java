import java.io.*;
public class FileDecript extends FileDecorator
{
    String s = "";

    InputStream its;
    int key;
    public FileDecript(InputStream its)throws IOException,FileNotFoundException
    {
        super(its);
        
    }
    public void getKey(int key){
        this.key=key;
    }

    public String decript(String n)throws IOException,FileNotFoundException
    {
        char []rep={'a','e','i','o','u'};
        char []ver={'/','*','-','+','.'};
        String all="";
        String c="";
        int i=0;
        
        char o;

        while((i=super.read())!=-1)
        {
            c+=(char)i;

        }
    
        StringBuilder sb=new StringBuilder();
        String dc="";
        //char [] my=c.toCharArray();
        char c2[]=c.toCharArray();
            for(char c3:c2){
               // System.out.print(" "+(char)(c3+key));
                dc+=(char)(c3+key);
                
            }
            StringBuilder sb1=new StringBuilder();
            sb1.append(dc);
            dc=new String(sb1.reverse());
            char my[]=dc.toCharArray();

        for(int  co=0; co<my.length;co++)
        {
            int flag=0;
            o=my[co];
            for(int j=0;j<5;j++)
            {
                if(ver[j]==o)
                {
                    all+=rep[j];
                    flag=1;
                    
                }
            }
            if (flag==0)
                all+=my[co];
        
        }
            FileWriter fw=new FileWriter(n);
            fw.write(all);
            fw.close();
        
              return "Success decripte file";
    }
    
  
}