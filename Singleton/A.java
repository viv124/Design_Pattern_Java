class A
{
    public static void main(String[] s)
    {
        //Singleton so=new Singleton("viv");
         Singleton so=Singleton.getobj();
         Singleton so1=Singleton.getobj();
         System.out.println(so.hashCode());
         System.out.println(so1.hashCode());
         System.out.println(so1);
         System.out.println(so);
         so.dis();
       
    }
}