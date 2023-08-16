public class FoodFactory implements Combo{
    public Food getInstanceB(int i){
        Food f=null;
        switch(i){
            case 1:
                f=new Roti();
                break;
            case 2:
                f=new Bhakhari();
                break;
        }
        return f;
    }
    public drink getInstanceA(int i){
        return null;
    }

}