public class Child 
{
    public static void main(String[] args)
    {
        Icecream ch=new Chocolate(new PinatButter(new Chocolate(new Vanila())));
       // PinatButter pb=new PinatButter(ch);
        System.out.println(ch.getCost());
        System.out.println(ch.getDescription());

        // System.out.println(pb.getCost());
        // System.out.println(pb.getDescription());

    }
}