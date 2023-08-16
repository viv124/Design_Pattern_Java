class A{
    void read()
    {
        System.out.println("read");
    }
    void write()
    {
        System.out.println("write");
    }
    String delete()
    {
        return "delete";
    }
}
class B extends A
{
    String role;
    public B(String role)
    {
       this.role=role;
    }

    void read()
    {
        if((role=="admin")||(role=="user")||(role=="guest"))
        {
               super.read();
               
        }
    }
    void write()
    {
        if((role=="admin")||(role=="user"))
        {
            super.write();
        }
    }
    String delete()
    {
        String a="Sorry not access delete file you";
        if(role=="admin")
        {
           a=super.delete();
        }
        return a;
    }
   
}
class AB{
    public static void  main(String[] a)
    {
        A b=new B("user");
       
        b.read();
        b.write();
        System.out.println(b.delete());
    }
}