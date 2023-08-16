public class Encrypt
{
    public static void main(String[] args)
    {
        int key=5;
        String text="vivek Ahire";  
        char[] cc=text.toCharArray();
        String[] c1=new c[text.length()];
        for(int i=0;i<text.length();i++)
        {
           c1[i]=text[i]+key;
          // System.out.print(cc[i]);
           System.out.print(c1[i]);
        }
        System.out.println(text);
        // for(char c1:c)
        // {
        //    c1-=key;
        //    System.out.print(c1);
        // }

    }
}