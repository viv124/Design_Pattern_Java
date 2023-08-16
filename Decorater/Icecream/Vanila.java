/**
 * The Vanila class represents a basic vanilla ice cream item.
 * It implements the Icecream interface to provide concrete implementations for cost and description.
 */

public class Vanila implements Icecream
{
     /**
     * Gets the cost of the vanilla ice cream.
     *
     * @return The cost of the vanilla ice cream.
     */
    @Override
    public double getCost()
    {
        return 35;
    }
    
    /**
     * Gets the description of the vanilla ice cream.
     *
     * @return The description of the vanilla ice cream.
     */
    @Override
    public String getDescription()
    {
        return "Vanila Icecream";
    }
}