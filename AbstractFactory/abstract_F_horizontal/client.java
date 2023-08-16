import java.util.*;
class client{
    public static void main(String []args){
        Scanner s=new Scanner (System.in);

        System.out.println(" Enter for 1(Drink), 2(Food)");
        int i=s.nextInt();
        Combo c=ComboFactory.aahar(i);
            System.out.println(" Enter your chooce");
            int j=s.nextInt();
        if(i==1){   
            drink d=c.getInstanceA(j);
            System.out.println(d.drinking());
        }
        else{
            Food f=c.getInstanceB(j);
            System.out.println(f.eating());
        }

        
        // Combo c1=ComboFactory.aahar(2);
        
        
    }
}