public class Client
{
    public static void main(String[] s)throws IllegalAccessException,InstantiationException
    {
        CF<Tea> efact=new CF<Tea>(Tea.class);
        Drink e=efact.getInstance();
         e.drink();
    }
}
