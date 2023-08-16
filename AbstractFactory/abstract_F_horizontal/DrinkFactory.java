public class DrinkFactory implements Combo{
    public drink getInstanceA(int i){
        drink d=null;
        switch(i){
            case 1:
                d=new Milk();
                break;
            case 2:
                d=new ButterMilk();
                break;
        }

        return d;

    }
    public Food getInstanceB(int i){
        return null;
    }

}