public class client 
{
    public static void main(String[] a)
    {
          Mahadev_sankul mh = new Mahadev_sankul();

          Department computer = new Department("Computer science");
          Department economic = new Department("Economic");
          Department msw = new Department("MSW");
          Department Yog = new Department("Yog");
          
         mh.addObserver(computer);
         mh.addObserver(economic);
         mh.addObserver(msw);
         mh.addObserver(Yog);
         
         mh.removeObserver(Yog);

         mh.setInfo("Please fast fill exam form");
        //  System.out.println(computer.getInfo());
        //  System.out.println(economic.getInfo());
        //  System.out.println(msw.getInfo());
        //  System.out.println(Yog.getInfo());
        
    }
}