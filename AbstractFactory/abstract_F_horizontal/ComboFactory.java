public class ComboFactory{
    public static Combo aahar(int i){
        Combo c=null;
        switch(i){
            case 1:
                c=new DrinkFactory();
                break;
            case 2:
                c=new FoodFactory();
                break;
        }
        return c;
    }
}