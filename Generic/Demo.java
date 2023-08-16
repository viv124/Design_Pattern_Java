public class Demo
{
    public static void main(String[] args)throws IllegalAccessException,InstantiationException
    {
        GenericFactory<Emp> efact=new GenericFactory<Emp>(Emp.class);
        Emp e=efact.getInstance();
        e.setEname("vivek");
         System.out.println(e.getEname());
    }
}