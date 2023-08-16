
/**
 * The Ice_Decorator abstract class acts as a base class for decorators that enhance the behavior of Icecream objects.
 * It implements the Icecream interface and provides a protected field to hold the wrapped Icecream object.
 */

public abstract class Ice_Decorater implements Icecream
{
    Icecream ic;
   /**
     * Constructs a new Ice_Decorator object with the provided Icecream object to be wrapped.
     *
     * @param ic The Icecream object to be wrapped by this decorator.
     */
    
    public Ice_Decorater(Icecream ic)
    {
        this.ic=ic;
    }

     /**
     * Gets the cost of the decorated ice cream.
     * This method is declared as abstract to be implemented by concrete decorators.
     *
     * @return The cost of the decorated ice cream.
     */
    @Override
     public  double getCost()
     {
        return ic.getCost();
     }

   /**
     * Gets the description of the decorated ice cream.
     * This method is declared as abstract to be implemented by concrete decorators.
     *
     * @return The description of the decorated ice cream.
     */
    @Override
     public  String getDescription()
     {
        return ic.getDescription();
     }
}